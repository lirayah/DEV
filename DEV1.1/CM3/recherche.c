#include<stdlib.h>
#include<stdio.h>

/*
On demande la valeur à chercher puis on compare
cette valeur récursivement dans la fonction recherche
si il en existe une alors on stocke l'indice du tableau et on incrémente triple pour savoir si il en existe 3
si il en existe aucune alors on retourne la valeur par défaut qui est -1
*/


int triple;

int recherche(int value, int* tab, int taille){
    int indice=-1,drapeau,i;
    i++;
    if(value==tab[i]){
        indice==i;
        triple++;
    }
    recherche(value,tab,taille-1);
    return indice;
}


int main(void){
    int value;
    int taille=6;
    int indice;
    int tab[6]={1,2,3,4,5,6};
    printf("Valeur à chercher: ");
    scanf("%d",&value);
    indice=recherche(value,tab,taille);
    if(indice=-1){
        fprintf(stderr,"Valeur non trouvée");
    }
    else{
        if(indice==1 && triple==1){
            printf("%d est au début du tableau",value);
        }
        if(indice==taille && triple==1){
            printf("%d est à la fin du tableau",value);
        }
        if(triple==3){
            printf("%d est présent trois fois dans le tableau",value);
        }
    }
}