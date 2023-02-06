#include<stdlib.h>
#include<stdio.h>

int drapeau;

int chasse(unsigned int tab[],int size){
    int vf=0;
    chasse(tab,size-1);
    if (tab[size]%2!=0){
        drapeau++;
    }
    if(drapeau!=1){
        vf=1;
    }
    return vf;
}

int main(void){
    unsigned int tab[5]={2,4,6,8,10};
    int size=5,vf;
    vf=chasse(tab,size);
    if(vf==0){
        printf("Le tableau contient que des paires\n")
    }
    if(drapeau==size){
        printf("Le drapeau contient que des impaires");
    }
    return 0;
}
