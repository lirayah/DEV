#include <stdlib.h>
#include <stdio.h>

int fibo(int i){
	if (i==0)
		return 0;
	if (i==1)
		return 1;
	else{
		return fibo(i-2) + fibo(i-1);
		}
}

int main(void){
	int un=15,rep;
	/*printf("u combien: ");
	scanf(" %d", &un);*/
	rep=fibo(un);
	printf("%d\n",rep);
}
