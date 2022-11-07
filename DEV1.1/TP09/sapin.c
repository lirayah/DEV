#include <stdlib.h>
#include <stdio.h>

int main(void){
	int a;
	int b;
	int c;
	int d=0;
	int i;
	int e;
	printf("Hauteur ? ");
	scanf(" %d",&b);
	e=b-1;
	for(a=0;a<b;a++){
		for (i=e;i>0;i--){
			printf(" ");
		} 
		for(c=0;c<=d;c++){
			printf("*");
		}
		d+=2;
		e--;
		printf("\n");
	}
}