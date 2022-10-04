#include<stdlib.h>
#include <stdio.h>

int main(void){
    int n;
    int k;
    int tri[31][31];
    for (n=0;n<=30;n++){
        for(k=0;k<=n;k++){
            if(k==0 || k==n){
                tri[n][k]=1;
            }
            else{
                tri[n][k]=tri[n-1][k-1]+tri[n-1][k];
            }
        }
    }
    for (n=0;n<=30;n++){    
        for(k=0;k<=n;k++){
            printf("%10d",tri[n][k]);
        }
        printf("\n");
    }
}