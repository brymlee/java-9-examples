JAVAC=../jdk-10.0.1/bin/javac
JAVA=../jdk-10.0.1/bin/java

all: find-java-sources compile-sources

javac-help:
	${JAVAC} --help

java-help:
	${JAVA} --help

find-java-sources:
	find src -name *.java > java-sources.txt

compile-sources:
	${JAVAC} -d classes @java-sources.txt

run:
	${JAVA} --module-path classes -m brymlee.cli/brymlee.cli.HelloWorldApplication 
