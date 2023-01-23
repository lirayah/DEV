#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<grp.h>
#include<string.h>

int main(int argc, char * argv[]) {
	struct group * etu = getgrnam("students21");
	char ** names = etu->gr_mem;
	
	printf("%c", names[1]);
	return EXIT_SUCCESS;
}