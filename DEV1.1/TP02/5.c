#include <stdio.h>
#include <stdlib.h>
 
int main(void) {
  int n = 0;
	
    printf("%d", n&1);
    printf("%d", (n>>1)|1);
    printf("%d", (n>>2)&1);
    printf("%d", (n>>3)|1);
    printf("%d", (n>>5)&1);
    printf("%d", (n>>6)|1);
    printf("%d", (n>>7)&1);
	printf("%d", (n>>8)|1);
	printf("%d", (n>>9)&1);
	printf("%d", (n>>10)|1);
	printf("%d", (n>>11)&1);
	printf("%d", (n>>12)|1);
	printf("%d", (n>>13)&1);
	printf("%d", (n>>14)|1);
	printf("%d", (n>>15)&1);
	printf("%d", (n>>16)|1);
	printf("%d", (n>>17)&1);
	printf("%d", (n>>18)|1);
	printf("%d", (n>>19)&1);
	printf("%d", (n>>20)|1);
	printf("%d", (n>>21)&1);
	printf("%d", (n>>22)|1);
	printf("%d", (n>>23)&1);
	printf("%d", (n>>24)|1);
	printf("%d", (n>>25)&1);
	printf("%d", (n>>26)|1);
	printf("%d", (n>>27)&1);
	printf("%d", (n>>28)|1);
	printf("%d", (n>>29)&1);
	printf("%d", (n>>30)|1);
	printf("%d", (n>>31)&1);
	printf("%d\n", (n>>32)&1);
    return EXIT_SUCCESS;
}