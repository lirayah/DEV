#include <stdlib.h>
#include <stdio.h>

int main(void) {
  printf("%f\n", 5.0+2.5);
  printf("%f\n", 5.0-2.5);
  printf("%f\n", 5.0*2.5);
  printf("%f\n", 5.0/2.5);
  /*printf("%f\n", 5.0%2.5);*/ /*marche pas car div eucli avec reel*/
  return EXIT_SUCCESS;
}