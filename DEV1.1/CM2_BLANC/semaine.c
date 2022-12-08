#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void){
    int jour, mois, annee;
    printf("date ");
    scanf("%d/%d/%d",&jour,&mois,&annee);
    struct tm date;
    date.tm_sec=0;
    date.tm_min=0;
    date.tm_hour=0;
    date.tm_mday=jour;
    date.tm_mon=mois-1;
    date.tm_year=annee+100;
    mktime(&date);
    printf("%d\n",date.tm_wday);
    if(date.tm_wday==0){
        printf("dimanche");
    }
    if(date.tm_wday==1){
        printf("lundi\n");
    }
    if(date.tm_wday==2){
        printf("mardi\n");
    }
    if(date.tm_wday==3){
        printf("mercredi\n");
    }
    if(date.tm_wday==4){
        printf("jeudi\n");
    }
    if(date.tm_wday==5){
        printf("vendredi\n");
    }
    if(date.tm_wday==6){
        printf("samedi\n");
    }
}