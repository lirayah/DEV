#include<stdio.h>
#include<stdlib.h>

int main(double argc,char *argv[]){
    char a=argv[2];
    double i=(double)argv[1];
    if(a=="cm"){
        i=i/2.54;
        printf("%lf in",i);
    }
    if(a=="in"){
        i=i*2.54;
        printf("%lf cm",i);
    }
}

/*int main(int argc, char *argv[]){
    int i;
    printf("argc = %d\n",argc);
    for (i=0;i<argc;i++){
        printf("argv[%d] = %s\n",i,argv[i]);
    }
}*/