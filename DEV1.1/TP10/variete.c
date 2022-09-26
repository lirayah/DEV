#include <stdlib.h>
#include <stdio.h>

int main(void){
    signed char a=77;
    unsigned char b=77;
    short int c=77;
    unsigned short int d=77;
    int e=77;
    unsigned int f=77;
    long int g=77;
    unsigned long int h=77;
    long long int i=77;
    unsigned long long int j=77;
    float k=77;
    double l=77;
    long double m=77;
    printf("%hhd %hhu %hd %hu %d %u %ld %lu %lld %llu %f %lf %Lf",a,b,c,d,e,f,g,h,i,j,k,l,m);
}