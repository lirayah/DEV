#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void){
    double abs_a;
    double ord_a;
    double abs_b;
    double ord_b;
    printf("abscisse de a");
    scanf("%lf", &abs_a);
    printf("ordonnee de a");
    scanf("%lf", &ord_a);
    printf("abscisse de b");
    scanf("%lf", &abs_b);
    printf("ordonnee de b");
    scanf("%lf", &ord_b);
    printf("%f\n",sqrt(pow((abs_a-abs_b),2)+pow((ord_a-ord_b),2)));
}