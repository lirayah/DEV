#include <stdlib.h>
#include <stdio.h>

int main(void){
	int a;
	int b=1;
	while (a!=-1){
		a=0;
		b=0;
		printf ("table de : ");
		scanf("%d", &a);
		if (a!=-1){
			for (b;b<=10;b=b+1){
				printf("%d x %d = %4d\n",a,b,a*b);
			}
		}
	}	
}