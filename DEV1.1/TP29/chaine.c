#include <stdio.h>
#include <stdlib.h>

struct maillon_ {
    char c;
    struct maillon_* prev;
};
typedef struct maillon_ maillon;
typedef maillon* pile;

void push(pile* p, char c) {
    maillon* m = calloc(1, sizeof(maillon));
    m->c = c;
    m->prev = *p;
    *p = m;
}

char pop(pile* p) {
    char c = (*p)->c;
    *p = (*p)->prev;
    return c;
}

int empty(pile p) {
    return p == NULL;
}

char top(pile p) {
    return p->c;
}

void clear(pile* p) {
    *p = NULL;
}
pile create() {
    return NULL;
}

void destroy(pile* p) {
    free(p);
}