#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(int argc, char** argv){
    char* position1;
    char* position2;
    unsigned long ent1;
    unsigned long ent2;
    ent1=strtoul(argv[1],&position1,10);
    ent2=strtoul(argv[2],&position2,10);
    if(((ent1==0) && (position1==argv[1])) || ((ent2==0)&&(position2==argv[2]))){
        printf("FK IT");
    }
    long a=strtol(argv[1],NULL,10);
    long b=strtol(argv[2],NULL,10);
    printf("%ld\n",a*b);
}
//si un arg pas un int -> prend l'arrondi au défaut
//si un arg manquant -> Segmentation fault (core dumped)