#include<stdlib.h>
#include<stdio.h>
#include<time.h>

int main(void){
    srand(time(NULL));
    int a;
    int b=5;
    int i;
    int j;
    int f;
    int nb;
    int tab[4]={0,0,0,0};
    printf("Nombre de tests: ");
    scanf("%d",&nb);
    for(i=0;i<nb;i++){
        b=5;
        for(j=0;j<4;j++){
            a=rand();
            if(a%2==0){
                b--;
            }
            if(a%2!=0){
                b++;
            }
        }
        if(b==1){
            tab[0]=tab[0]+1;
        }
        if(b==3){
            tab[1]=tab[1]+1;
        }
        if(b==5){
        tab[2]=tab[2]+1;
        }
        if(b==7){
            tab[3]=tab[3]+1;
        }
        if(b==9){
            tab[4]=tab[4]+1;
        }
    }
    for(i=0;i<=4;i++){
    f=0;
        while (f<tab[i]){
            printf(" ▄");
            f=f+1;
        }
        printf("\n");
    }
}