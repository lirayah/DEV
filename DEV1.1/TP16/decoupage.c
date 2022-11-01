#include<stdlib.h>
#include<stdio.h>

int triangle(int h){
    int a;
    int c;
    int d=0;
    for(a=0;a<h;a++){
        for(c=0;c<=d;c++){
            printf("*");
	    }
	    d+=1;
        printf("\n");
    }
    return 0;
}

int carre(int h){
    int a;
    int e;
    int f;
    for(a=0;a<h;a++){
        printf("*");
    }
    for(e=0;e<=h-3;e++){
        printf("\n");
        printf("*");
        for(f=0;f<=h-3;f++){
            printf(" ");
            }
        printf("*");
    }
    printf("\n");
    for(a=0;a<h;a++){
        printf("*");
    }
    printf("\n");
    return 0;
}


int main(void){
    char a;
    int hauteur;
    while(a!='q'){
        printf(" t) Triangle\n c) Carré\n q) Quitter\nVotre choix ? ");
        scanf(" %c",&a);
        hauteur=0;
        if(a=='t'){
            printf("Hauteur ? ");
            scanf("%d",&hauteur);
            triangle(hauteur);
        }
        if(a=='c'){
            printf("Hauteur ? ");
            scanf("%d",&hauteur);
            carre(hauteur);
        }
    }
    printf("Au revoir...\n");
    return EXIT_SUCCESS;
}

