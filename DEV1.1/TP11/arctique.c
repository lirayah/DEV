#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void){
    double dist;
    double theta;
    double x=0;
    double y=0;
    printf("distance= ");
    scanf(" %lf",&dist);
    printf("theta= ");
    scanf(" %lf",&theta);
    x=dist*cos(theta);
    y=dist*sin(theta);
    printf("coordonnees :\n x=%f \n y=%f\n",x,y);
}