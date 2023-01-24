#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct char_ {
	char letter;
	struct char_* next;
};
typedef struct char_ string_char;
typedef string_char* string;

string toString(char* str) {
	string_char* last_c = NULL;
	for (int i = strlen(str)+1; i >= 0; i--) {
		string_char* c = malloc(sizeof(string_char));
		c->letter = str[i];
		c->next = last_c;
		last_c = c;
	}
	return last_c;
}

char* toCharT(string str) {
	int count = 0;
	string str2 = str;
	while (str2 != NULL) {
		count++;
		str2 = str2->next;
	}
	char* new_str = calloc(sizeof(char), count);
	
	for (int i = 0; i < count; i++) {
		new_str[i] = str->letter;
		str = str->next;
	}
	return new_str;
}

void sputs(string str) {
	while (str != NULL) {
		printf("%c", str->letter);
		str = str->next;
	}
	printf("\n");
}

void sfgets(string* str, int maxLength, FILE * stream) {
	char line[2048];
	fgets(line, maxLength, stream);
	
	*str = toString(line);
}

int main(int argc, char * argv[]) {
	string c;
	sfgets(&c, 1000, stdin);
	sputs(c);
	return EXIT_SUCCESS;
}

