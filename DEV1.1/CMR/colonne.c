#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(int argc,char * argv[]){
    int i;
    int taille;
    for(i=1;i<argc;i++){
        if(strlen(argv[i])>taille){
            taille=strlen(argv[1]);
        }
    }
    for(i=1;i<argc;i++){
        printf("%50s\n",argv[i]);
    }
    return EXIT_SUCCESS;
}