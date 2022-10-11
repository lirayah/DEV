#include<stdlib.h>
#include<stdio.h>

int main(void){
    int i;
    int f;
    int tab[19];
    for(i=0;i<19;i++){
        f=0;
        printf("Nombre %d ",i+1);
        scanf("%d",&tab[i]);
    }
    for(i=0;i<19;i++){
        f=0;
        while (f<tab[i]){
            printf("▄");
            f=f+1;
        }
        printf("\n");
    }
}