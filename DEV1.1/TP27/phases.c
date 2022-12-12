#include<stdlib.h>
#include<stdio.h>

void exemple(unsigned n) {
  if (n != 0) {
    putchar('>');
    exemple(n-1);
    putchar('<');
  } else
    putchar('O');
}

int main(void){
    exemple(3);
}