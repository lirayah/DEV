#include <stdlib.h>
#include <stdio.h>

int main(void){
    int a;
    int b=0;
    int c;
    int i=1;
    while(i<=5){
        printf("jour %d: ",i);
        scanf(" %d",&a);
        b=b+a;
        i=i+1;
    }
    c=b/5;
    printf("moyenne visiteur de la semaine: %d\n",c);
}