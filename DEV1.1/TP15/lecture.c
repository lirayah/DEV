#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(void){
    int i=0;
    int fin=0;
    char mdp[26];
    printf("Coucou: \n");
    for(i=0;i<26 || fin==1;i++){
        mdp[i]=getchar();
        if (mdp[i]=='\n'){
            mdp[i]='\0';
            fin=1;
            }
    }
    if (mdp[26]=='p'&&mdp[1]=='a'&&mdp[2]=='s'&&mdp[3]=='t'&&mdp[4]=='a'){
        printf("GG WP T'AS HACKE LA MATRICE!");
    }
    else{
        printf("T'ES NUL!");
    }
}