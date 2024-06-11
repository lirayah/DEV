all : test_df 

./lib_tea/tea.o : ./lib_tea/tea.c
	gcc -c ./lib_tea/tea.c -o ./lib_tea/tea.o

df.o : df.c
	gcc -c df.c

test_df.o : test_df.c
	gcc -c test_df.c

test_df : test_df.o df.o ./lib_tea/tea.o
	gcc -o test_df df.o test_df.o ./lib_tea/tea.o
