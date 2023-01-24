#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct char_ {
	char letter;
	struct char_* next;
	struct char_* prev;
};
typedef struct char_ string_char;
typedef string_char* string;

string toString(char* str) {
	string_char* last_c = NULL;
	for (int i = strlen(str); i >= 0; i--) {
		string_char* c = malloc(sizeof(string_char));
		c->letter = str[i];
		c->next = last_c;
		if (last_c != NULL) last_c->prev = c;
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

int sstrlen(string str) {
	int count = 0;
	while (str != NULL) {
		count++;
		str = str->next;
	}
	return count - 1;
}

void sstrcpy(string* str1, string str2) {
	string_char* last_c = NULL;
	int length = sstrlen(str2);
	while (str2->next != NULL) str2 = str2->next;
	for (int i = length; i >= 0; i--) {
		string_char* c = malloc(sizeof(string_char));
		c->next = last_c;
		c->letter = str2->letter;
		str2 = str2->prev;
		if (last_c != NULL) c->prev = last_c;
		last_c = c;
	}
	
	*str1 = last_c;
}

int sstrcmp(string str1, string str2) {
	while (str1 != NULL || str2 != NULL) {
		if (str1 == NULL && str2 == NULL) break;
		else if (str1 == NULL && str2 != NULL) return -1;
		else if (str1 != NULL && str2 == NULL) return -1;
		else if (str1->letter != str2->letter) return -1;
		str1 = str1->next;
		str2 = str2->next;
	}
	return 0;
}

string sstrcat(string* stra, string* strb) {
	string str1 = *stra;
	string str2 = *strb;
	while (str1->next->next != NULL) str1 = str1->next;
	str1->next = str2;
	str2->prev = str1;
	while (str1->prev != NULL) str1 = str1->prev;
}

int main(int argc, char * argv[]) {
	string c = toString("Hello World !");
	string d = NULL;
	sstrcpy(&d, c);
	sputs(d);
	sputs(c);
	sstrcat(&d, &c);
	sputs(d);
	
	return EXIT_SUCCESS;
}