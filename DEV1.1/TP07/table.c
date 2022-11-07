#include <stdlib.h>
#include <stdio.h>

int main(void){
	int a;
	int b=1;
	printf ("table de : ");
	scanf("%d", &a);
	for (b;b<=10;b=b+1){
		printf("%d x %d = %4d\n",a,b,a*b);
	}
}