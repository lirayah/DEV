#include "df.h"
#include "./lib_tea/tea.h"

#include <stdio.h>
#include <assert.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#include <string.h>
#include <stdint.h>

int main(int argc, char *argv[])
{
	uint64 p = 4611686018427402023,
		   a,b,
		   A,B,AB,BA,
		   g;

	uint32_t k[4]; // for tea
				   //



	g=generateur(p);
	srand(getpid()^time(NULL));

	for (int i = 0;i < 2; i++){

		a = 2 + rand()%(p-3);
		A=expm(g,a,p);

		b = 2 + rand()%(p-3);
		B = expm(g,b,p);


		AB = expm(A,b,p);

		BA = expm(B,a,p);
		//printf("%lx %lx %lx %lx %lx %lx\n",a,b,A,B,AB,BA);
		assert(AB == BA);

		memcpy((void*)(k+2*i),(void*)&AB,sizeof(uint32_t)*2);
	}

	printf("key for tea = (%x,%x,%x,%x)\n",k[0],k[1],k[2],k[3]);



	while(1){
		uint32_t  v[2]={0};
		ssize_t nb_read = read(0,v,sizeof(v));
		if (nb_read <= 0)
			break;
		encrypt_tea(v,k);
		decrypt_tea(v,k);
		write(1,v,sizeof(v));
	}
	return 0;
}
