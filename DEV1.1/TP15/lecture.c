#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(void){
    int i=0;
    int fin=0;
    char mdp[26];
    printf("Coucou: \n");
    for(i=0;i<26||fin==1;i++){
        mdp[i]=getchar();
        if (mdp[i]=='\n'){
            mdp[i]='\0';
            fin=1;
            }
    }
    if (strcmp(mdp,'pasta'==0)){
        printf("GG WP T'AS HACKE LA MATRICE!\n");
    }
    else{
        printf("T'ES NUL!\n");
    }
}