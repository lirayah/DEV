#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/socket.h>
#include <resolv.h>
#include <arpa/inet.h>
#include <string.h>
#include <fcntl.h>
#include <errno.h>
#include <sys/time.h>
#include <sys/wait.h>
#include <assert.h>
#define MAXBUFF 4096

int handle_transferred_file(int sock,struct sockaddr_in * client_addr)
{
	char bufname[256];

	char buff[MAXBUFF];
	int fd;
	ssize_t nbytes,z;

	char addr[INET_ADDRSTRLEN];
	snprintf(bufname,256,"%s.%d",inet_ntoa(client_addr->sin_addr),ntohs(client_addr->sin_port));
	//fd = open(bufname,O_WRONLY|O_CREAT|O_TRUNC,0666); 
	//if (fd == -1) {
	//	perror("open");
	//	exit(1);
	//}

	while (1) {
		//bzero(buff,MAXBUFF);
		nbytes = read(sock,buff,MAXBUFF);
		if (nbytes == -1) {
			perror("read");
			exit(1);
		}
		if (nbytes==0) break;

		write(sock,buff,nbytes);
		z=z+nbytes;
	}

	inet_ntop(AF_INET,&(client_addr->sin_addr.s_addr),addr,INET_ADDRSTRLEN);
	printf("%d bytes recieved from %s\n", z, addr);
	shutdown(sock,SHUT_RDWR);
	close(sock);

	exit(0);

}

int main(int argc, char * argv[]) 
{
	int 				/* file descriptor for the tranferred file */ 
		listen_sock,    /* socket for listenning connection */
		service_sock,   /* socket for a connected client */
		nbytes, z=0;
	int yes=1;

	struct sockaddr_in server_addr, 
					   client_addr;

	int addr_len; 

	struct sigaction sa;

	if (argc != 2) {
		printf("Usage: %s <port number>\n",argv[0]);
		exit(1);
	}

	sigemptyset(&sa.sa_mask);
	sa.sa_flags = SA_NOCLDWAIT;
	sa.sa_handler = SIG_DFL;
	assert (sigaction(SIGCHLD, &sa, NULL) != -1);



	listen_sock = socket(AF_INET, SOCK_STREAM, 0);
	assert( listen_sock > 0);

	assert (setsockopt(listen_sock, SOL_SOCKET, SO_REUSEADDR, &yes, sizeof(int)) != -1);



	bzero(&server_addr, sizeof(server_addr));
	server_addr.sin_family = AF_INET;
	server_addr.sin_port = htons(atoi(argv[1]));
	server_addr.sin_addr.s_addr = INADDR_ANY;
	addr_len = sizeof(server_addr);

	assert(bind(listen_sock, (struct sockaddr *)&server_addr, sizeof(struct sockaddr)) != -1);

	assert(listen(listen_sock,10) == 0);



	while(1){

		service_sock = accept(listen_sock,
				(struct sockaddr *)&client_addr , 
				&addr_len);

		assert(service_sock >= 0);

		pid_t p = fork();
		if (p==0){
			close(listen_sock);
			handle_transferred_file(service_sock,&client_addr);
		}
	}
}
