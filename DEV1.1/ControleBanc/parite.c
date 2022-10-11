#include<stdlib.h>
#include<stdio.h>

int main(void){
    int a;
    int b;
    printf("Nombre 1? ");
    scanf("%d",&a);
    printf("Nombre 2? ");
    scanf("%d",&b);
    if(a%2==0 || b%2==0){
        printf("le produit est un nombre pair\n");
    }
    else{
        printf("le produit est un nombre impair\n");
    }
}