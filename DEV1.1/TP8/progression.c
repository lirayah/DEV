#include <stdlib.h>
#include <stdio.h>

int fibo(int i){
	if (i==0)
		return 0;
	if (i==1)
		return 1;
	else
		return fibo(i-2) + fibo(i-1);
}

int main(void){
	int U0=0;
	int U1=1;
	int un;
	printf("u combien: ");
	scanf(" %d", &un);
	printf("%d\n",fibo(un));
}