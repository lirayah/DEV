#include <stdio.h>
#include <stdlib.h>

void printTable(double* t, int n) {
    if (n > 0) {
        printf("%.5lf", *t);
        if (n > 1) printf(", ");
        printTable(t+1, n-1);
    } else puts("");
}

int main(void) {
    double t[5] = {1.72, 5.28, 9.025, 36.14, 3.14159};
    printTable(t, 5);
    return EXIT_SUCCESS;
}