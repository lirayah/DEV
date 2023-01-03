#include<stdio.h>
#include<stdlib.h>
#include<time.h>

struct mail{
    unsigned short int alea;
    struct mail* next;
};
typedef struct mail maillon;

maillon* ajouter_maillon(maillon* premier, int new){
    maillon * p=(maillon*) malloc(sizeof(maillon));
    if (p){
        p->next=premier;
        p->alea=new;
    }
    return p;
}

void affichage(maillon* premier){
    maillon* p;
    for(p=premier; p!=NULL; p=p->next){
        printf("%d ",p->alea);
    }
}

int aleatoire(void){
    int oui;
    oui=rand()%888+111;
    return oui;
}

void comparer(maillon* premier){
    maillon* p;
    int a=0;
    for(p=premier; p!=NULL; p=p->next){
        if(p->alea>a){
            a=p->alea;
        }
    }
    printf("max=%d",a);
}

int main(void){
    int alea,i;
    maillon* suivant;
    maillon* premier=NULL;
    maillon* p;
    srand(time(NULL));
    for(i;i<10;i++){
        alea=aleatoire();
        premier=ajouter_maillon(premier,alea);
    }
    affichage(premier);
    comparer(premier);
    for(p=premier;p!=NULL;p=suivant){
        suivant=p->next;
        free(p);
    }
    printf("\n");
}