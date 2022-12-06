#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(int argc,char* argv[]){
    char* a=argv[2];
    double i=strtod(argv[1],NULL);
    if(strcmp(a,"cm")==0){
        i=i/2.54;
        printf("%.4lf in\n",i);
    }
    if(strcmp(a,"in")==0){
        i=i*2.54;
        printf("%.4lf cm\n",i);
    }
}

/*int main(int argc, char *argv[]){
    int i;
    printf("argc = %d\n",argc);
    for (i=0;i<argc;i++){
        printf("argv[%d] = %s\n",i,argv[i]);
    }
}*/