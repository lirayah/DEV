#include <stdlib.h>
#include <stdio.h>

int main(void) {
  int x=3;               
 
  if (x==2)
    printf("%s", "x vaut 2\n");   
  else
    printf("%s", "x est different de 2\n");              
 
  printf("%d", x);                                          
  printf("\n");                                          
 
  if (x==0)
    printf("%s", "x vaut 0\n");                                         
  else
    printf("%s", "x est different de 0\n");          
 
  printf("%d", x);                                          
  printf("\n");                                          
 
  return EXIT_SUCCESS;
}