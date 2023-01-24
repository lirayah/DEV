#include <stdio.h>
#include <stdlib.h>

struct maillon_ {
    char c;
    struct maillon_* next;
};
typedef struct maillon_ maillon;
typedef maillon* file;

void push(file* f, char c) {
    maillon* m = calloc(1, sizeof(maillon));
    m->c = c;
    if (*f == NULL) {
        *f = m;
    } else {
        file* start = f;
        file ff = *f;
        while (ff->next != NULL) ff = ff->next;
        ff->next = m;
        f = start;
    }
}

char pop(file* f) {
    char c = (*f)->c;
    *f = (*f)->next;
}

int empty(file f) {
    return f == NULL;
}