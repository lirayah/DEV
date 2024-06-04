#include <stdio.h>
#include <assert.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>

#define MASK_BIT_7      0x80
#define MASK_BIT_6      0x40
#define MASK_BIT_5      0x20
#define MASK_BIT_4      0x10
#define MASK_BIT_3      0x08
#define MASK_BIT_2      0x04
#define MASK_BIT_1      0x02
#define MASK_BIT_0      0x01


unsigned char next(unsigned char lfsr)
{
    unsigned char bit;

    // On récupère le bit qui va se rajouter à droite
    bit = ((lfsr & MASK_BIT_7) >> 7) // On décale de x car c'est un XOR a bit donc
          ^ ((lfsr & MASK_BIT_6) >> 6)
          ^ ((lfsr & MASK_BIT_5) >> 5) ^ ((lfsr & MASK_BIT_4) >> 4)
          ^ ((lfsr & MASK_BIT_3) >> 3) ^ ((lfsr & MASK_BIT_1) >> 1);

    // On fait le décalage à gauche et ajoute à droite le bit
    unsigned char res = (lfsr << 1) | bit ;

    return res;
    //return (lfsr << 1) | __builtin_parity(lfsr & (MASK_BIT_7 | MASK_BIT_6 | MASK_BIT_5 | MASK_BIT_4 | MASK_BIT_3 | MASK_BIT_1)); Marche aussi car fait le XOR booléen avec le builtin
}

int main(int argc, char *argv[])
{
	int fd_in,fd_out;
	unsigned char w,buf;


	assert(argc >= 4);
	fd_in = open(argv[1],O_RDONLY);
	fd_out = open(argv[2],O_WRONLY|O_TRUNC|O_CREAT,0600);
	w = (unsigned char)strtol(argv[3],NULL,0);

	while(1){
		ssize_t nb = read(fd_in,&buf,1);
		if (nb <=0)
			break;
		buf ^= w;
		write(fd_out,&buf,1);
		w=next(w);
	}
	return 0;
}
