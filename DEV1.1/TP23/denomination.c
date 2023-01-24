#include<stdio.h>
#include<stdlib.h>

int main(int argc, char * argv[]) {
	int r, g, b;
	r = strtod(argv[1], NULL);
	g = strtod(argv[2], NULL);
	b = strtod(argv[3], NULL);
	int found = 0;
	FILE* flux = fopen("rgb.txt", "r");
	int r2, g2, b2;
	char name[100];

	while (!feof(flux)) {
		fscanf(flux, "%d %d %d\t\t%99[^\n]", &r2, &g2, &b2, &name);
		if (r == r2 && g == g2 && b == b2) {
			found++;
			printf("Color found : \x1B[38;2;%d;%d;%dm%s\x1B[37m.\n", r, g, b, name);
		}
	}
	if (found==){
        puts("No color found...");
    }
	
	return EXIT_SUCCESS;
}
