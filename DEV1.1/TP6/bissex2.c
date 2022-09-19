#include <stdlib.h>
#include <stdio.h>

int main(void){
	int annee;
	scanf("%d",&annee);
	if (annee%4==0 && annee%100!=0 || annee%400==0)
		printf("annee bissextile");
	else
		printf("annee non bissextile");
}