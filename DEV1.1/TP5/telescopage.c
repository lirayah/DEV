#include <stdlib.h>
#include <stdio.h>

int main(void) {
	int n;
	int b;
	double x;
	char a;
	printf("reel:");
	n = scanf("%lf", &x);
	printf("%e\n", x);
	printf("cara:");
	b = scanf(" %c", &a);
	printf("%c %c %c %c %c\n",a,a,a,a,a);
	return EXIT_SUCCESS;
}