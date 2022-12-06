#include<stdio.h>
#include<stdlib.h>

int main(void){
    FILE *fichier=fopen("./top10","r");
    int oui[50];
    int i=0;
    if(fichier){
        while(fread(oui,sizeof(7),1,fichier)!=0){
            printf("%d\n",oui);
            i++;
        }
    }
    fclose(fichier);
}