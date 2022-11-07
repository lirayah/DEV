#include <stdlib.h>
#include <stdio.h>

int main(void){
	int annee;
	int bis=0;
	scanf("%d",&annee);
	if (annee%4==0){
		bis=bis+1;
		if(annee%100==0)
			bis=bis-1;
	}
	if (bis==1)
		printf("annee bissextile");
		else
			printf("annee non bissextile");
}