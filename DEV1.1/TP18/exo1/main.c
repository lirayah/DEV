/* TP19 Exercice 1 : fichier main.c */

#include <stdlib.h>
#include <stdio.h>
#include "personne.h"
#include "repertoire.h"

typedef enum {AJOUTER, AFFICHER, SORTIR} options;

options saisir_option() {
	short o;
	printf("\nChoisissez une option :\n");
	printf("1] Ajouter une personne.\n");
	printf("2] Afficher le repertoire.\n");
	printf("3] Sortir\n");
	printf("? ");
	scanf("%hd", &o);
	switch(o) {
	case 1 : return AJOUTER;
	case 2 : return AFFICHER;
	case 3 : return SORTIR;
	default : return AFFICHER;
	}
}

int main(void) {
	options opt;
	repertoire r = construire_repertoire();
	while ((opt=saisir_option())!=SORTIR)
		switch(opt) {
		case AJOUTER :
			ajouter_personne(r, saisir_personne());
			break;
		case AFFICHER :
			afficher_repertoire(r);
			break;
		default :
		  ; /* rien a faire */
		}
	detruire_repertoire(r);
	return EXIT_SUCCESS;
}
