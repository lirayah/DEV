JC = javac
JCFLAGS = -d build -cp build -implicit:none -sourcepath "src:tmp"
JVM = java
JVMFLAGS = -cp build

build/galerie/Galerie.class : src/galerie/Galerie.java build/galerie/Vue.class
	${JC} ${JCFLAGS} src/galerie/Galerie.java

build/galerie/Vue.class : src/galerie/Vue.java build/galerie/Souris.class
	${JC} ${JCFLAGS} src/galerie/Vue.java

build/galerie/Souris.class : src/galerie/Souris.java
	${JC} ${JCFLAGS} src/galerie/Souris.java

run : build/galerie/Galerie.class
	${JVM} ${JVMFLAGS} galerie.Galerie

clean :
	-rm -f build/galerie/*.class

mrproper : clean build/galerie/Galerie.class

.PHONY : run clean mrproper

jar: build/galerie/Galerie.class
	jar cvfe galerie.jar galerie.Galerie -C build galerie -C res img
