#include<stdio.h>
#include<stdlib.h>
#include<math.h>

struct nb_complex {
	float re;
	float im;
};
typedef struct nb_complex complex;

float module(complex z) {
	//return sqrt(pow(z.re, 2) + pow(z.im, 2));
    return sqrt(z.re*z.re+z.im*z.im);
}

complex conjugue(complex z) {
	z.im = -z.im;
	return z;
}

complex inverse(complex z) {
	float a = z.re;
	float b = z.im;
	z.re = a/a*a + b*b);
	z.im = -b/a*a + b*b);
	return z;
}

int main(int argc, char * argv[]) {
	complex a = {argv[1], argv[2]};
	printf("le module de a est : %f\n", module(a));
    printf("le conjugue de a est : %f", conjugue(a));
    printf("l'inverse de a est : %f", inverse(a));
	return EXIT_SUCCESS;
}