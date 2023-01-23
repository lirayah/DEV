#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(int argc, char * argv[]) {
	FILE* flux;
	flux = fopen("top10", "r");

	int NewRank = atoi(argv[1]);
	int added = 0;

	char* ChallengerNames[11] = {};
	int ChallengerRanks[11] = {};

	int count = 0;

	if (flux) {
		do {
			int rank;
			char * name = calloc(4, sizeof(char));

			fread(&rank, 4, 1, flux);
			fread(name, 1, 3, flux);

			if (rank < NewRank && !added) {
				ChallengerNames[count] = calloc(4, sizeof(char));
				strcpy(ChallengerNames[count], argv[2]);
				ChallengerRanks[count] = NewRank;
				added = 1;
				count++;
			}

			ChallengerNames[count] = calloc(4, sizeof(char));
			strcpy(ChallengerNames[count], name);
			ChallengerRanks[count] = rank;
			count++;

		} while (!feof(flux));
		fclose(flux);

		flux = fopen("top10", "w");
		if (flux) {
			//printf("%d\n", count);
			/*for (int i = 0; i < count-2; i++) {
				printf("%s\n", ChallengerNames[i]);
				fwrite(&ChallengerRanks[i], 4, 1, flux);
				fwrite(&ChallengerNames[i], 1, 3, flux);
			}*/
			fclose(flux);
		}
	}
	return EXIT_SUCCESS;
}

