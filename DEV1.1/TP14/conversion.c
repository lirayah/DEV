#include<stdlib.h>
#include<stdio.h>

int main(void) {
  long long int n = 4618760256959462783LL;
  double* p = (double*) &n;
  printf("π = %lf\n", *p);
  return EXIT_SUCCESS;
}