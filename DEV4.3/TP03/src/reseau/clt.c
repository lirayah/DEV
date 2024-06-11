#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>

#include <netinet/tcp.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/socket.h>
#include <resolv.h>
#include <fcntl.h>
#include <sys/time.h>
#include <assert.h>
#define MAXBUFF 4096 

int main(int argc, char * argv[]) {
	int sock,  z=0, fd;
	char buff[MAXBUFF];
	struct sockaddr_in server_addr;
	int addrlen; 

	if (argc != 4) {
		printf("Usage: %s <IP-address> <port number> <file to send>\n",argv[0]);
		exit(1);
	}

	sock = socket(AF_INET, SOCK_STREAM, 0);
	assert(sock != -1);

	bzero(&server_addr, sizeof(server_addr));
	server_addr.sin_family = AF_INET;
	server_addr.sin_port = htons(atoi(argv[2]));

	assert( inet_aton(argv[1], (struct in_addr*)&server_addr.sin_addr.s_addr) != 0 );

	addrlen = sizeof(server_addr);

	fd = open(argv[3],O_RDONLY,0666); 
	assert(fd != -1);

	assert(connect(sock,(struct sockaddr *)&server_addr, addrlen) != -1);

	while(1) {
		
		ssize_t mbytes, nbytes;

		nbytes=read(fd,buff,MAXBUFF);

		if (nbytes==-1) {
			perror("read");
			exit(1);
		}
		if (nbytes==0) {
			break;
		}

		mbytes = write(sock,buff,nbytes);
		if (mbytes == -1) {
			perror("write");
			exit(1);
		}
		z=z+mbytes;
	}

	printf("file %s sent (%d bytes)",argv[3],z);

	close(sock);
	exit(0);
}
