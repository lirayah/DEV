#include <stdlib.h>
#include <stdio.h>

int main(void){
	int n;
	scanf("%d",&n);
	if ((n%3)==0)
		printf("%d\n",n);
	if (((n-1)%3)==0)
		printf("%d\n",n-1);
	if (((n+1)%3)==0)
		printf("%d\n",n+1);
}