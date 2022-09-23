#include <stdlib.h>
#include <stdio.h>

int main(void){
	int a;
	int b;
	char s='*';
	printf("Hauteur ? ");
	scanf(" %d",&b);
	for(a=0;a<=b;a++){
		printf("%c\n", s);
	}
}