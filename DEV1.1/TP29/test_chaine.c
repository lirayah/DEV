#include <stdio.h>
#include <stdlib.h>
#include "chainee_tables.c"

int main(int argc, char* argv[]) {
    pile p = create();
    puts("La pile attend vos ordres.");
    char input[10];
    do {
        fgets(input, 10, stdin);
        if (input[0] == '+') {
            push(&p, input[1]);
            printf("Le caractère %c a été ajouté.\n", input[1]);
        } else if (input[0] == '-') {
            if (!empty(p)) {
                char c = pop(&p);
                printf("Le caractère %c à été supprimé\n", c);
            } else puts("La pile est vide !");
        }
    } while (input[0] != 'q' && input[0] != 'Q');
}