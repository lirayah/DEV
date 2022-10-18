#include<stdlib.h>
#include<stdio.h>

int main(void){
    char a='9';
    long int b=9L;
    long double c=9.0L;
    char d=0x9;
    printf("a=%c\nb=%ld\nc=%.0Lf\nd=%hhd\n",a,b,c,d);
}