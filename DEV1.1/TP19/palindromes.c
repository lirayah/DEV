#include<stdio.h>
#include<stdlib.h>

char inverse(const char* s){
    char* inv_str = (char*) calloc(strlen(s), sizeof(char));
	for (int i = strlen(s)-1; i >= 0; i--) {
		inv_str[i] = s[strlen(s)-i-1];
	}
	return inv_str;
}

int main(int argc, char* argv[]){
    for(int i=1; i<argc;i++){
        if (strcmp(argv[i], inverse(argv[i])) == 0){
            printf("%s est palindrome.\n", argv[i]);
        }
		else{
            printf("%s n'est pas palindrome.\n", argv[i]);
        }
    }
}