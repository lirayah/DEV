#include <stdlib.h>
#include <stdio.h>

int main(void){
    int a;
    signed char b;
    printf("Nombre= ");
    scanf(" %d",&a);
    b = (signed char)a;
    printf("%hhd\n",b);
}