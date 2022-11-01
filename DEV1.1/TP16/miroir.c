#include<stdlib.h>
#include <stdio.h>
#include<time.h>

int affichage(void){
    int i;
    for(i=0;i<10;i++){
    printf("+-----");
    }
    printf("+");
    printf("\n");
    for(i=0;i<10;i++){
        printf("| ");
        printf("%3d");//,tab[i]);
        printf(" ");
    }
    printf("|");
    printf("\n");
    for(i=0;i<10;i++){
        printf("+-----");
    }
    printf("+\n");
    return 0;
}

int remplissage(void){
    int a=-50;
    int b=50;
    int j;
    srand(time(NULL));
    for(j=0;j<10;j++){
        tab[j]=a+rand()%(b-a+1);
    }
    for(i=0;i<10;i++){
        printf("| ");
        printf("%3d",tab[i]);
        printf(" ");
    }
    return 0;
}

int inverse(){
    int j;
}


int main(void){
    int tab[10];
    remplissage();
    affichage();
    inverse();
}