#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(int argc, char** argv){
    int a=argc;
    int i=1;
    for(i;i<a;i++){
        printf("%c",argv[i][0]);
    }
    printf("\n");
}