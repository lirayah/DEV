#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(void){
    int i=0;
    int fin=0;
    char mdp[27];
    printf("Coucou");
    for(i=0;i<26 || fin==1;i++){
        mdp[i]=getchar();
        if (mdp[i]==' '){
            fin=1;
            }
    }
    if (mdp[0]=='p'&&mdp[1]=='a'&&mdp[2]=='s'&&mdp[3]=='t'&&mdp[4]=='a'){
        printf("GG WP T'AS HACKE LA MATRICE!");
    }
    else{
        printf("T'ES NUL!");
    }
}