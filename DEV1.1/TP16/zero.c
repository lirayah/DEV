#include<stdlib.h>
#include<stdio.h>

int zero(double *a) {
  *a = 0.0;
}

int main(void) {
  double x=37.5;
  printf("avant : %f\n", x);
  zero(&x);
  printf("après : %f\n", x);
  return EXIT_SUCCESS;
}