#include <stdio.h>
#include <stdlib.h>
#include "chainee.h"

int opening(char c) {
    return c == '{' || c == '(' || c == '[';
}

int isPar(char c) {
    return c == '{' || c == '}' || c == '(' || c == ')' || c == '[' || c == ']';
}

int isMatching(char a, char b) {
    return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
}

int main(int argc, char* argv[]) {
    FILE* f = fopen(argv[1], "r");
    pile p;
    if (f) {
        int valid = 1;
        while (!feof(f)) {
            char c = fgetc(f);
            if (isPar(c)) {
                if (opening(c)) push(&p, c);
                else {
                    char par = pop(&p);
                    if (!isMatching(par, c)) {
                        printf("Le fichier %s est mal parenthesé !\n", argv[1]);
                        valid = 0;
                        break;
                    }
                }
            }
        }
        if (valid) printf("Le fichier %s est bien parenthesé !\n", argv[1]);
        fclose(f);
    } else puts("Error opening file.");
    return EXIT_SUCCESS;
}