#include <stdio.h>
#include <stdlib.h>
 
int main(void) {
  printf("%d\n", 100/6);
  printf("%d\n", 100%6);
  printf("%d\n", 0x1A*015);
  printf("%d\n", -3/5);
  printf("%d\n", -31/5);
  printf("%d\n", -31%5);
  printf("%d\n", 100*(3/5));
  printf("%d\n", 100*3/5);
  printf("%d\n", 2-3-5);
  printf("%d\n", 2-(3-5));
  return EXIT_SUCCESS;
}