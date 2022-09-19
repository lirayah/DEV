#include <stdlib.h>
#include <stdio.h>


int main(void) {
  printf("Unicode : %c%c\n", '\xC3', '\xAE');
  printf("Latin 1 : %c\n", '\xEE');
  return EXIT_SUCCESS;
}