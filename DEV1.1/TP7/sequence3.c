#include <stdlib.h>
#include <stdio.h>

int main(void) {
	int a;
	int b;
	scanf("%d", &a);
	scanf("%d", &b);
	if (a<b){
		for (a;a<b;a=a+1){
			printf("%d\n",a);
		}
	}
	if (a>b){
		for (b;b<a;b=b+1){
			printf("%d\n",b);
		}
	}
}