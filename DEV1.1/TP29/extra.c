#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]) {
    pile p = create();
    push(&p, 'O');
    push(&p, 'N');
    push(&p, 'C');
    push(&p, 'R');
    push(&p, 'S');
    printf("%c\n", top(p));
    clear(&p);
    printf("%d\n", empty(p));
}