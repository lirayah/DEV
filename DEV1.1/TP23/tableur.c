#include<stdio.h>
#include<stdlib.h>
//Affiche un tableau 2D, donnez la longueur / hauteur du tableau et il l'affichera
void show2dtable(int l, int c, int table[][5]) {
	for (int line = 0; line < (l*2)+1; line++) {
		if (line == 0 || line == (l*2)+1 || line % 2 == 0) {
			for (int col = 0; col < c; col++) printf("+-----");
			printf("+\n");
		} else {
			for (int col = 0; col < c; col++) printf("| %3d ", table[line/2][col]);
			printf("|\n");
		}
	}
}
void writeTable(char* filename, int l, int c, int table[][5]) {
	FILE* flux = fopen(filename, "w");
	for (int line = 0; line < l; line++) {
		for (int column = 0; column < c; column++) {
			if (column+1 == c) {
				fprintf(flux, "%d", table[line][column]);
			} else fprintf(flux, "%d;", table[line][column]);
		}
		fprintf(flux, "\n");
	}
	fclose(flux);
}
int main(void) {
	int table1[2][5] = {};
	int table2[3][5] = {};
	int table3[5][5] = {};
	for (int i = 0; i < 5; i++) {
		table1[0][i] = i+1;
		table1[1][i] = i+1;
	}
	for (int i = 0; i < 15; i++) {
		table2[i/5][i%5] = i+1;
	}
	for (int y = 0; y < 5; y++) {
		for (int x = 0; x < 5; x++) {
			if (y < x) table3[x][y] = y+1;
			else table3[x][y] = 0;
		}
	}
	show2dtable(2, 5, table1);
	writeTable("t1.csv", 2, 5, table1);
	printf("\n");
	show2dtable(3, 5, table2);
	writeTable("t2.csv", 3, 5, table2);
	printf("\n");
	show2dtable(5, 5, table3);
	writeTable("t3.csv", 5, 5, table3);
	return EXIT_SUCCESS;
}