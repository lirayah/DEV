#include<stdio.h>
#include<stdlib.h>

struct block_ {
	int value;
	struct block_* next;
};
typedef struct block_ block;
typedef block* list;

void remLast(list l) {
	block* b = l;
	while (b->next->next != NULL) b = b->next;
	b->next = NULL;
}

void showList(list l) {
	block* b = l;
	while (b != NULL) {
		printf("%d ", b->value);
		b = b->next;
	}
	puts("");
}

list circularRotation(list l) {
	block* b = l;
	while (b->next->next != NULL) b = b->next;
	list first = b->next;
	first->next = l;
	b->next = NULL;
	return first;
}

int main(void) {
	block b4 = {19, NULL};
	block b3 = {15, &b4};
	block b2 = {10, &b3};
	block b1 = {5, &b2};
	block b0 = {1, &b1};
	list l = &b0;
	showList(l);
	remLast(l);
	showList(l);
	l = circularRotation(l);
	showList(l);
	return EXIT_SUCCESS;
}
