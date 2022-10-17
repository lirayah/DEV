#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(void){
    int a=0;
    int b=200;
    int i;
    int n;
    char tab[200];
    printf("phrase: ");
    scanf("%200s",tab);
    printf("%s\n",tab);
    for(i=0;i<200;i++){
        if(tab[i]=='e'){
            a++;
        }
    }
    for(i=0;i<200;i++){
        for(n=i;n<200;n++){
//tester a partir du i pas déjà fait sinon double decre
            if(tab[i]==tab[n](
                b--;
            )        
        }
    }
    printf("%d\n",a);
}