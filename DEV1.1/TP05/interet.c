#include <stdlib.h>
#include <stdio.h>

int main(void) {
	double n;
	printf("argent initial?");
	scanf("%lf", &n);
	n=n*1.04;
	printf("année 1:%-10.4f\n", n);
	n=n*1.04;
	printf("année 2:%-10.4f\n", n);
	n=n*1.04;
	printf("année 3:%-10.4f\n", n);
	n=n*1.04;
	printf("année 4:%-10.4f\n", n);
	n=n*1.04;
	printf("année 5:%-10.4f\n", n);
	n=n*1.04;
	printf("année 6:%-10.4f\n", n);
	n=n*1.04;
	printf("année 7:%-10.4f\n", n);	
}