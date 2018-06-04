JAVAC=../jdk-10.0.1/bin/javac
JAVA=../jdk-10.0.1/bin/java

all: modules find-java-sources compile-sources

javac-help:
	${JAVAC} --help

java-help:
	${JAVA} --help

modules:
	mkdir modules
	wget -P modules http://central.maven.org/maven2/org/hamcrest/hamcrest-all/1.3/hamcrest-all-1.3.jar
	mv modules/hamcrest-all-1.3.jar modules/hamcrest.all.jar
	wget -P modules http://central.maven.org/maven2/junit/junit/4.12/junit-4.12.jar
	mv modules/junit-4.12.jar modules/junit.jar

find-java-sources:
	find brymlee.evens/src -name *.java > brymlee.evens/src/java-sources.txt
	find brymlee.evens/test -name *.java > brymlee.evens/test/java-sources.txt

compile-sources:
	${JAVAC} -d modules/brymlee.evens --module-path modules @brymlee.evens/src/java-sources.txt
	${JAVAC} -d modules/brymlee.evens.test --module-path modules @brymlee.evens/test/java-sources.txt

test:
	${JAVA} --module-path modules --add-modules brymlee.evens.test -m "junit/org.junit.runner.JUnitCore" brymlee.evens.test.EvensServiceTest

run:
	${JAVA} --module-path modules -m "brymlee.cli/brymlee.cli.HelloWorldApplication"
