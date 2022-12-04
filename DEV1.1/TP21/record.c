#include<stdio.h>
#include<stdlib.h>

int main(void){
    FILE * fichier=fopen("./top10","r");
    char oui[50];
    int i=0;
    if(fichier!=NULL){
        while(fread(oui,sizeof(7),1,fichier)!=0){
            printf("%s",oui[i]);
            i++;
        }
    }
    fclose(fichier);
}