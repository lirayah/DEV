#include<stdlib.h>
#include<stdio.h>

int main(void){
    FILE *flux;
    int temp=0;
    flux=fopen("/dev/random","r");
    if(flux){
        fread(&temp,sizeof(int),1,flux);
        if(temp%6>=0){
            printf("%d\n",(temp%6)+1);
        }
        else{
            printf("%d\n",(temp%6)+6);
        }
        fclose(flux);
    }
    return 0;
}