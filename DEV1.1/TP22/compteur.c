#include<stdio.h>
#include<stdlib.h>

int main(void){
    FILE* flux=fopen("./a","r");
    int compteur=0;
    if(flux){
        fread(&compteur,4,1,flux);
    }
    fclose(flux);
    compteur++;
    printf("%d\n",compteur);
    flux=fopen("./a","w");
    if(flux){
        fwrite(&compteur,4,1,flux);
    }
    fclose(flux);
}