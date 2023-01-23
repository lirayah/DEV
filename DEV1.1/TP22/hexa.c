#include<stdio.h>
#include<stdlib.h>
int main(int argc, char * argv[]) {
	FILE* flux = fopen(argv[1], "r");
	if (flux) {
		unsigned char lettre, count = 0;
		while(!feof(flux)) {
			if (count == 0) puts("");
			fread(&lettre, 1, 1, flux);
			printf("%02x", lettre);
			fread(&lettre, 1, 1, flux);
			printf("%02x ", lettre);
			count = (count + 1) % 8;
		}
		puts("");
		fclose(flux);
	} else {
		puts("Error : Could not open file.");
		return EXIT_FAILURE;
	}
	return EXIT_SUCCESS;
}
