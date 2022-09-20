#include <stdlib.h>
#include <stdio.h>

int main(void) {
	int a;
	int b;
	scanf("%d", &a);
	scanf("%d", &b);
	if (a<b){
		do {
			printf("%d\n",a);
			a=a+1;
		} while (a<b);
		}	
	if (a>b){
		do {
			printf("%d\n",b);
			b=b+1;
		} while (a>b);
	}
}