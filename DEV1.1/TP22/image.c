#include<stdio.h>
#include<stdlib.h>
#include<graph.h>

int main(void){
    int largeur, hauteur;
	couleur color;
	FILE* flux = fopen("image.bin", "r");
	if (flux) {
		fread(&largeur, 4, 1, flux);
		fread(&hauteur, 4, 1, flux);
		InitialiserGraphique();
		CreerFenetre(0, 0, largeur, hauteur);
		for (int x = 0; x < largeur; x++) {
			for (int y = 0; y < hauteur; y++) {
				fread(&color, sizeof(couleur), 1, flux);
				ChoisirCouleurDessin(color);
				DessinerPixel(x, y);
			}
		}
		Touche();
		FermerGraphique();
 		return EXIT_SUCCESS;
	} else return EXIT_FAILURE;
}