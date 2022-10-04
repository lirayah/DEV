#include<stdlib.h>
#include <stdio.h>

int main(void){
    int i;
    int hihi=0;
    int a=1;
    int b;
    int tab1[5][2];
    int tab2[5][3];
    int tab3[5][5];
    printf("tab1\n");
    for(i=0;i<2;i++){
        b=1;
        for(hihi=0;hihi<5;hihi++){
            tab1[hihi][i]=b;
            b++;
            printf(" %4d",tab1[hihi][i]);
        }
        printf("\n");
    }
    printf("tab2\n");
    for(i=0;i<3;i++){
        for(hihi=0;hihi<5;hihi++){
            tab2[hihi][i]=a;
            a++;
        }
    }
    for(i=0;i<3;i++){
        for(hihi=0;hihi<5;hihi++){
            printf(" %4d",tab2[hihi][i]);
        }
        printf("\n");
    }
    printf("tab3\n");
    for(i=0;i<5;i++){
        for(hihi=0;hihi<5;hihi++){
            if(i>hihi){
                tab3[i][hihi]=hihi+1;
            }
            else{
                tab3[i][hihi]=0;
            }
        }
    }
    for(i=0;i<5;i++){
        for(hihi=0;hihi<5;hihi++){
            printf(" %4d",tab3[i][hihi]);
        }
        printf("\n");
    }
}