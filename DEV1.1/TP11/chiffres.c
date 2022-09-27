#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void){
    double a;
    int b;
    int c;
    int d;
    printf("Entrez un reel: ");
    scanf("%lf",&a);
    a=a*10;
    b=(int)a;
    d=b%10;
    a=a/10;
    a=trunc(a);
    b=(int)a;
    c=b%10;
    printf("Chiffres des unites: %d\n",c);
    printf("Chiffres des dixiemes: %d\n",d);
}