#include<stdlib.h>
#include <stdio.h>
#include<time.h>
/*a+rand()%(b-a+1)*/

int main(void){
    int a=-50;
    int b=50;
    int max;
    int i;
    int d;
    int tab[10];
    srand(time(NULL));
    tab[0]=a+rand()%(b-a+1);
    max=tab[0];
    for(i=1;i<10;i++){
        tab[i]=a+rand()%(b-a+1);
        if (tab[i]>max){
            max=tab[i];
            d=i;
        }
    }
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
    for(i=0;i<10;i++){
        printf("+-----");
    }
    printf("+");
    printf("\n");
    for(i=9;i>=0;i--){
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
}