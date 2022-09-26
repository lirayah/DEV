#include <stdlib.h>
#include <stdio.h>

int main(void){
    int a;
    int b;
    int r;
    printf("a=");
    scanf(" %d", &a);
    printf("b=");
    scanf(" %d", &b);
    while (b!=0){
        r=a%b;
        a=b;
        b=r;
    }
    printf("pgcd= %d\n", a);
}