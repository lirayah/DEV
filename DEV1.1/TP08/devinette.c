#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main(void){
	srand(time(NULL));
	int a=rand();
	int b;
	int compteur;
	a=rand()%101;
	do{
		printf("%d", a);
		printf("numero?");
		scanf(" %d", &b);
		++compteur;
	}while(compteur<5 && a!=b);
}