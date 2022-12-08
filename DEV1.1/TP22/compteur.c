#include<stdio.h>
#include<stdlib.h>

int main(void){
    FILE *flux;
    flux=fopen("./a","w");
    if(flux){
        
        fclose(flux);
    }
}