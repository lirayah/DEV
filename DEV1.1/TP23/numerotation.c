#include<stdio.h>
#include<stdlib.h>

int main(int argc, char * argv[]) {
	FILE* flux;
	flux = fopen(argv[1], "r");
	fseek(flux, 0L, SEEK_END);
	long size = ftell(flux);
	fclose(flux);
	fprintf(stdout, "La taille du fichier est de : %ld octets.\n", size);
	return EXIT_SUCCESS;
}
