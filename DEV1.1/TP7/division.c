#include <stdlib.h>
#include <stdio.h>

int main(void){
	int a;
	int b;
	int q;
	printf("valeur1 = ");
	scanf("%d",&a);
	printf("valeur2 = ");
	scanf(" %d",&b);
	while (a>=b){
		a=a-b;
		q=q+1;
	}
	printf("quotient= %d  reste %d\n",q,a);
}