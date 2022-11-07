#include <stdlib.h>
#include <stdio.h>

int main(void){
	int a;
	int b;
	int c;
	int d;
	printf("nombre:");
	scanf("%d", &d);
	printf("  X  |");
	for (a=0;a<=d;a++){
		printf("%4d",a);
	}
	printf("\n");
	for (b=0;b<=4;b++){
		printf("-");
	}
	printf("+");
	for (b=0;b<=d;b++)
		printf("----");
	
	for (b=0;b<=10;b++){
		printf("\n");
		printf("%3d  |",b);
		for (a=0;a<=d;a++){
			printf("%4d",c=a*b);
		}
	}
	printf("\n");
}
