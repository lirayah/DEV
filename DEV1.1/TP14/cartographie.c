#include<stdlib.h>
#include<stdio.h>

int main(void){
    float a=1;
    double b=2;
    long double c=3;
    char d=4;
    short int e=5;
    int f=6;
    long long unsigned int g=7;
    printf("%p\n%p\n%p\n%p\n%p\n%p\n%p\n",&a,&b,&c,&d,&e,&f,&g);
}
/*le debut de l'adresse est le meme a chaque exec jusqu'au 2derniers
bits qui eux changent car on passe a une autre variable
Le debut de l'adresse est tjr 0x7ff*/