//le prog va ecrire l'alphabet
#include<stdlib.h>
#include<stdio.h>

int main(void) {
  char min, maj;
  char *p = NULL;
 
  for(min = 'a', maj = 'A'; maj <= 'Z'; min++, maj++) {
    p = (p == &min) ? &maj : &min;
    putchar(*p);
  }
  putchar('\n');
  return EXIT_SUCCESS;
}