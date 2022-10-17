#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(void){
    int a=0;
    int b=200;
    int i;
    char tab[200];
    printf("phrase: ");
    scanf("%200s",tab);
    printf("%s\n",tab);
    for(i=0;i<200;i++){
        if(tab[i]=='e'){
            a++;
        }
    }
    printf("%d\n",a);
}