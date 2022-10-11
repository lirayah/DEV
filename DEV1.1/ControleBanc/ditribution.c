#include<stdlib.h>
#include<stdio.h>
#include<time.h>

int main(void){
    srand(time(NULL));
    RAND_MAX=1;
    int a;
    int b=10;
    int i;
    int j;
    int nb;
    int tab[4]
    printf("Nombre de tests: ");
    scanf("%d",&nb);
    for(i=0;i<nb;i++){
        for(j=0;j<3;j++){
            a=rand();
            if(a==0){
                b--;
            }
            else{
                b++;
            }
        }
        if b
    }
}