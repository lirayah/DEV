#include<stdlib.h>
#include<stdio.h>

/*Faire une liste chainée et comparer le nouvel élément à
tous les éléments de la liste chainée*/

struct mail{
    unsigned short int a;
    struct mail* next;
};
typedef struct mail maillon;

maillon* ajouter_maillon(maillon* premier, int new){
    maillon * p=(maillon*) malloc(sizeof(maillon));
    if (p){
        p->next=premier;
        p->a=new;
    }
    return p;
}

void affichage(maillon* premier){
    maillon* p;
    for(p=premier; p!=NULL; p=p->next){
        printf("%d ",p->a);
    }
}

void comparer(maillon* premier,int new){
    maillon* p;
    for(p=premier; p!=NULL; p=p->next){
        if(p->a%new==0){
            fprintf(stderr,"Perdu!");
            return EXIT_FAILURE;
        }
    }
}

int main(void){
    int b,i=0;
    maillon* p;
    maillon* premier;
    while(1){
        printf("Entrez un entier: ");
        scanf("%u",&b);
        i++;
        for(p=)/*Faire une boucle pour comparer le nouvel element à tous les précédents*/
            comparer(p,b);
        /*Si le nouvel élément rentre dans les conditions alors lui créer un maillon*/
    }
}