#include<stdio.h>
#include<stdlib.h>

struct taille
{
    char a;
    char b;
    char c;
};


int main (void){
    struct taille test={};
    printf("%d\n",sizeof(test));
}