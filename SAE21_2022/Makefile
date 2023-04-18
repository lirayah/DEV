### VARIABLES ###
JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none
JVM = java
JVMFLAGS = 

### RULES COMPILATION ###
MainClass.class : MainClass.java Fenetre.class
	${JC} ${JCFLAGS} MainClass.java

Ouverture.class : Ouverture.java
	${JC} ${JCFLAGS} Ouverture.java

Menu.class : Menu.java ChoixFichier.class Fenetre.class
	${JC} ${JCFLAGS} Menu.java

ChoixFichier.class : ChoixFichier.java
	${JC} ${JCFLAGS} ChoixFichier.java

ChargementGrille.class : ChargementGrille.java Ouverture.class
	${JC} ${JCFLAGS} ChargementGrille.java

CreationGrille.class : CreationGrille.java Modif.class
	${JC} ${JCFLAGS} CreationGrille.java

GenerationGrille.class : GenerationGrille.java Modif.class
	${JC} ${JCFLAGS} GenerationGrille.java 

Modif.class : Modif.java Detect.class
	${JC} ${JCFLAGS} Modif.java

Detect.class : Detect.java
	${JC} ${JCFLAGS} Detect.java
	
Fenetre.class : Fenetre.java ChargementGrille.class CreationGrille.class GenerationGrille.class
	${JC} ${JCFLAGS} Fenetre.java


### RULES EXECUTION ###
run : MainClass.class
	${JVM} ${JVMFLAGS} MainClass

clean :
	-rm -f *.class

mrproper : clean MainClass.class

### BUTS FACTICES ###
.PHONY : run clean mrproper

### FIN ###