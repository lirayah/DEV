#include <stdlib.h>
#include <stdio.h>

int main(void) {
	int a;
	int b;
	scanf("%d", &a);
	scanf("%d", &b);
	if (a<b){
		while (a<b){
			printf("%d\n",a);
			a=a+1;
		}
	}	
	if (a>b){
		while (b<a){
			printf("%d\n",b);
			b=b+1;
		}
	}
}