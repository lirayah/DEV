#include <stdlib.h>
#include <stdio.h>

int main(void) {
	int base;
	double n;
	printf("argent initial?");
	base = scanf("%lf", &n);
	n=n*1.04;
	printf("année 1:%-10.2f\n", n);
	n=n*1.04;
	printf("année 2:%-10.2f\n", n);
	n=n*1.04;
	printf("année 3:%-10.2f\n", n);
	n=n*1.04;
	printf("année 4:%-10.2f\n", n);
	n=n*1.04;
	printf("année 5:%-10.2f\n", n);
	n=n*1.04;
	printf("année 6:%-10.2f\n", n);
	n=n*1.04;
	printf("année 7:%-10.2f\n", n);	
}