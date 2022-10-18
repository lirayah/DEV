#include<stdlib.h>
#include<stdio.h>

int main(void){
    int nb;
    int i;
    printf("Entrez le nombre de cases : ");
    scanf("%d", &nb);
    if(nb==0){
        return EXIT_SUCCESS;
    }
    printf("┌");
    for(i=0;i<nb-1;i++){
        printf("──┬");
    }
    printf("──┐\n");
    for(i=0;i<nb;i++){
        printf("│  ");
    }
    printf("│\n");
    printf("└");
    for(i=0;i<nb-1;i++){
        printf("──┴");
    }
    printf("──┘\n");
}