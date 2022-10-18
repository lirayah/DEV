#include<stdlib.h>
#include<stdio.h>
/*1 livre=20sous et 1 sou=12 deniers
1 livre =20*12 deniers (240)*/
int main(void){
    int deniers;
    int sous;
    int livre;
    printf("Combien de deniers ? ");
    scanf("%d", &deniers);
    livre=deniers/240;
    deniers=deniers%240;
    sous=deniers/12;
    deniers=deniers%12;
    if(deniers!=0){
        if(deniers==1){
            printf("1 denier\n");
        }
        else{
            printf("%d deniers\n",deniers);
        }
    }
    if(sous!=0){
        if(sous==1){
            printf("1 sou\n");
        }
        else{
            printf("%d sous\n",sous);
        }
    }
    if(livre!=0){
        if(livre==1){
            printf("1 livre\n");
        }
        else{
            printf("%d livres\n",livre);
        }
    }
}