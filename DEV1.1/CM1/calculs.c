#include<stdlib.h>
#include<stdio.h>

int main(void){
    int NOMBRE=5;
    double CIBLE=51.7;
    double rep;
    int i;
    int indice;
    double comparaison=CIBLE;
    double tab[NOMBRE];
    for(i=0;i<NOMBRE;i++){
        printf("case n°%d: ",i);
        scanf("%lf",&rep);
        tab[i]=rep;
    }
    for(i=0;i<NOMBRE;i++){
        if(tab[i]>CIBLE){
            if((tab[i]-CIBLE)<comparaison && (tab[i]-CIBLE)>=0){
                comparaison=tab[i]-CIBLE;
                indice=i;
            }
        }
        if(tab[i]<CIBLE){
            if((CIBLE-tab[i]<comparaison && (CIBLE-tab[i])>=0)){
                comparaison=CIBLE-tab[i];
                indice=i;
            }
        }
    }
    printf("La valeur la plus proche est dans la case n°%d\n",indice);
}