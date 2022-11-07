#include <stdlib.h>
#include <stdio.h>

int main(void){
    int a;
    int b;
    int c;
    int d=0;
    int e;
    int f;
    char s;
    while(s!='q'){
        printf(" t) Triangle\n c) Carré\n q) Quitter\nVotre choix ? ");
        scanf(" %c",&s);
        if(s=='t'){
            printf("Hauteur? ");
            scanf(" %d",&b);
            for(a=0;a<b;a++){
                for(c=0;c<=d;c++){
                    printf("*");
		        }
		    d+=1;
            printf("\n");
            }
        }
        if (s=='c'){
            printf("Hauteur? ");
            scanf(" %d",&b);
            for(a=0;a<b;a++){
                printf("*");
            }
                for(e=0;e<=b-3;e++){
                    printf("\n");
                    printf("*");
                    for(f=0;f<=b-3;f++){
                        printf(" ");
                    }
                    printf("*");
                }
            printf("\n");
            for(a=0;a<b;a++){
                printf("*");
            }printf("\n");
        }
    }
    printf("Au revoir...\n");
    return EXIT_SUCCESS;
}
