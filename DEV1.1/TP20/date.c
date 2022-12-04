#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void){
    time_t temps=time(NULL);
    struct tm * today=localtime(&temps);
    printf("%s/%s/%s",today->tm_year+1900,today->tm_mon+1,today->tm_mday);
}