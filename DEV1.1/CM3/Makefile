CC=gcc
CFLAGS= -Wall -c -ansi -pedantic
LDFLAGS= -Wall -ansi -pedantic
EXEC=menu

exo: reduction.o stack.o
	$(CC) -o exo reduction.o stack.o
reduction.o: reduction.c stack.h
	$(CC) reduction.c $(CFLAGS)
stack.o: stack.c stack.h
	$(CC) stack.c $(CFLAGS)
run:
	./exo