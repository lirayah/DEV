#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(void){
    int i=0;
    int fin=1;
    char mdp[26];
    printf("Coucou tu veux voir Malphite?: \n");
    for(i=0;i<26 && fin;i++){
        mdp[i]=getchar();
        if (mdp[i]=='\n'){
            mdp[i]='\0';
            fin=0;
            }
    }
    if (strcmp(mdp,"pasta")==0){
        printf("GG WP T'AS HACKE LA MATRICE!\n");
    }
    else{
        printf("T'ES NUL!\n");
    }
}