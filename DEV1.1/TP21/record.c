#include<stdio.h>
#include<stdlib.h>

int main(void){
    FILE* fichier=fopen("./top10","r");
    char name1[4],name2[4],name3[4];
    int i=0;

    if(fichier){
        while(!feof(fichier)){
            int score=NULL;
            char* name=calloc(3,sizeof(char));
            fread(&score,4,1,fichier);
            fread(name,1,3,fichier);
            if(feof(fichier)){
                break;
            }
            strcpy(name3,name2);
            strcpy(name2,name1);
            strcpy(name1,name);
            //faire la meme chose avec les scores (en utilisant des tableaux) et print
        }
    }
    fclose(fichier);
}