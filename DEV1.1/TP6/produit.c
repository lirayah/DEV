#include <stdlib.h>
#include <stdio.h>

int main(void){
	double a;
	double b;
	scanf("%lf", &a);
	scanf(" %lf", &b);
	if (a>0 && b>0)
		printf("positif\n");
	if (a<0 && b<0)
		printf("positif\n");
	if (a==0 || b==0)
		printf("neutre\n");
	if (a>0 && b<0)
		printf("negatif\n");
	if (a<0 && b>0)
		printf("negatif\n");
}