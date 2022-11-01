#include<stdlib.h>
#include <stdio.h>
#include<time.h>

int affichage(int tab[10]){
    int i;
    for(i=0;i<10;i++){
    printf("+-----");
    }
    printf("+");
    printf("\n");
    for(i=0;i<10;i++){
        printf("| ");
        printf("%3d",tab[i]);
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

int remplissage(int tab[10]){
    int a=-50;
    int b=50;
    int i;
    int j;
    srand(time(NULL));
    for(j=0;j<10;j++){
        tab[j]=a+rand()%(b-a+1);
    }
    return 0;
}

int inverse(int tab[10]){
    int i;
    int j;
    for(i=0;i<10;i++){
        printf("+-----");
    }
    printf("+\n");
    for(j=9;j>=0;j--){
        printf("| ");
        printf("%3d",tab[j]);
        printf(" ");
    }
    printf("|");
    printf("\n");
    for(j=0;j<10;j++){
        printf("+-----");
    }
    printf("+\n");
}


int main(void){
    int tab[10];
    remplissage(tab);
    affichage(tab);
    inverse(tab);
    return EXIT_SUCCESS;
}