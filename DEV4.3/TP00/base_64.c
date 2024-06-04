#include <stdio.h>
#include <string.h>
#include <fcntl.h>
#include <assert.h>
#include <unistd.h>


static const char base64_table[] = {
  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
  'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
  'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
  'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
  'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
  'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
  'w', 'x', 'y', 'z', '0', '1', '2', '3',
  '4', '5', '6', '7', '8', '9', '+', '/'
};

void base64_encode_file(char * file, char * file_encoded)
{
	int  i = 0;
	int fdin, fdout ;
	unsigned char buffer[3]; // octets a encoder
	unsigned char tmp[4];    // valeurs des 4 groupes de 6 bits
	char buffer_encoded[4];  // octets encodes
	ssize_t nb_read;



	fdin = open(file,O_RDONLY);
	fdout = open(file_encoded,O_WRONLY|O_TRUNC|O_CREAT,0644);

	assert(fdin  >= 0);
	assert(fdout >= 0);

	while(1){
		nb_read = read(fdin,buffer,3);

		if (nb_read < 3)
			break;
		// TODO 
		// calculer la valeur des 4 groupes de 6 bits de buffer
		
		tmp[0] = 0;
		tmp[1] = 0;
		tmp[2] = 0;
		tmp[3] = 0;

		for (i = 0; i < 4 ;i++)
			buffer_encoded[i] = base64_table[tmp[i]];

		write(fdout,buffer_encoded,4);

	}

	// TODO 
	/* il reste quelque chose ? */

	if ( nb_read != 0){
		for( i = nb_read; i < 3; i++)
			buffer[i] = 0;

		tmp[0] = 0;
		tmp[1] = 0;
		tmp[2] = 0;
		tmp[3] = 0;

		for (i = 0; i < nb_read + 1 ;i++)
			buffer_encoded[i] = base64_table[tmp[i]];

		for (i = nb_read + 1; i < 4 ;i++)
			buffer_encoded[i] = '=';


		write(fdout,buffer_encoded,4);
	}

	close(fdin);
	close(fdout);
}

int main(int argc, char *argv[])
{
	assert(argc >= 3);
	base64_encode_file(argv[1],argv[2]);
	return 0;
}

