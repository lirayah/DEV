#include <stdlib.h>
#include <stdio.h>

int main(void){
	int a;
	int b;
	int c;
	scanf("%d",&a);
	scanf(" %d",&b);
	scanf(" %d",&c);
	if (a<b && b<c)
		printf("%d %d %d\n",a,b,c);
	if (a<c && c<b)
		printf("%d %d %d\n",a,c,b);
	if (b<c && c<a)
		printf("%d %d %d\n",b,c,a);
	if (b<a && a<c)
		printf("%d %d %d\n",b,a,c);
	if (c<a && a<b)
		printf("%d %d %d\n",c,a,b);
	if (c<b && b<a)
		printf("%d %d %d\n",c,b,a);
}