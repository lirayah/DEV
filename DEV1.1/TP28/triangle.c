#include <stdio.h>
#include <stdlib.h>
#include <graph.h>
#include <math.h>
#include "graph_sup.h"

struct vec2_ {
    double x;
    double y;
};
typedef struct vec2_ vec2;

struct tri_ {
    vec2 p1;
    vec2 p2;
    vec2 p3;
};
typedef struct tri_ tri;

int level;

void drawTri(tri trig) {
    vec2 p1 = trig.p1;
    vec2 p2 = trig.p2;
    vec2 p3 = trig.p3;
    DessinerSegment(p1.x, p1.y, p2.x, p2.y);
    DessinerSegment(p2.x, p2.y, p3.x, p3.y);
    DessinerSegment(p3.x, p3.y, p1.x, p1.y);
}

tri makeTri(vec2 pos, double size) {
    vec2 p1 = pos;
    vec2 p2 = pos;
    vec2 p3 = pos;
    p2.x += size / 2;
    p3.x -= size / 2;
    p2.y += sqrt((3 * pow(size, 2)) / 4);
    p3.y += sqrt((3 * pow(size, 2)) / 4);
    tri trig = {p1, p2, p3};
    return trig;
}

vec2 makeFractal(vec2 pos, double size, int n) {
    if (n == 0) {
        drawTri(makeTri(pos, size));
        makeFractal(pos, size/2, n+1);
    } else if (n < level) {
        tri trig1 = makeTri(pos, size);
        tri trig2 = makeTri(trig1.p2, size);
        tri trig3 = makeTri(trig1.p3, size);
        drawTri(trig1);
        drawTri(trig2);
        drawTri(trig3);
        makeFractal(trig1.p1, size / 2, n+1);
        makeFractal(trig2.p1, size / 2, n+1);
        makeFractal(trig3.p1, size / 2, n+1);
    }
}

int main(int argc, char* argv) {
    printf("Niveau de complexité : ");
    scanf("%d", &level);
    vec2 vec = {WIDTH/2, 100};
    InitialiserGraphique();
    CreerFenetre(100, 100, WIDTH, HEIGHT);
    SetColor(0, 0, 0);
    makeFractal(vec, HEIGHT-200, 0);
    Touche();
    FermerGraphique();
}