#include<stdio.h>
#include<stdlib.h>

int main(void){
    int i;
    int j;
    int drapeau;
    int taille;
    float a;
    float* tab = NULL;
    printf("Taille? ");
    scanf("%d", &taille);
    tab = (float*) malloc(taille*sizeof(float));
    for(i=0;i<taille;i++){
        scanf(" %lf", &tab[i]);
    }
    for(i=0;i<taille;i++){
        drapeau=1;
        for(j=0;j<i;j++){
            if (tab[i]==tab[j]){
                drapeau=0;
            }
        }
        if (drapeau==1){
            printf("%f",tab[i]);
        }
    }
    free(tab);
}