#include <stdlib.h>
#include <stdio.h>
#include <math.h>

int main(void){
	int a;
	int b=2;
	int c;
	int d;
	printf("nombre");
	scanf(" %d", &a);
	d=a;
	a=a*a;
	while(b<d){
		if (a%b==0){
			printf("nombre non premier");
			return EXIT_SUCCESS;
		}
		else{
				b=b+1;
			}
		if (b==d){
					printf("nombre premier");
		}
	}
}