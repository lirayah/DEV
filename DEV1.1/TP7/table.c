#include <stdlib.h>
#include <stdio.h>

int main(void){
	int a;
	int b=1;
	scanf("%d", &a);
	for (b;b<=10;b=b+1){
		printf("%d x %d = %d\n",a,b,a*b);
	}
}