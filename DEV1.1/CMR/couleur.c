#include<stdlib.h>
#include<stdio.h>

int main(int argc, char const *argv[])
{
    int rouge=(int) strtol(argv[1],NULL,10);
    int vert=(int) strtol(argv[2],NULL,10);
    int bleu=(int) strtol(argv[3],NULL,10);
    FILE *fic=fopen("./echiquier.svg","r+");
    if(fic){
        fseek(fic,245,SEEK_SET);
        while(!feof(fic)){/*fin de fichier*/
            fseek(fic,67,SEEK_CUR);
            fprintf(fic,"%x%x%x",rouge,vert,bleu);
        }
    }
    fclose(fic);
    return EXIT_SUCCESS;
}
