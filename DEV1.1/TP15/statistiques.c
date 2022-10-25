#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(void){
    int a=0;
    int b=0;
    int drapeau;
    size_t c;
    int d;
    int i;
    int n;
    char tab[200];
    printf("phrase: ");
    fgets(tab,200,stdin);
    c=strlen(tab);
    d=c;
    for(i=0;i<c;i++){
        if(tab[i]=='e'){
            a++;
        }
    }
    for(i=0;i<c;i++){
        drapeau = 1;
        for(n=0;n<i;n++){
            if(tab[i]==tab[n]){
                drapeau = 0;
            }
        }
        if (drapeau==0){
            d--;
        }
    }
    d--;
    printf("nombre de e :%d \nnombre de caractères différents: %u\n",a,d);
}