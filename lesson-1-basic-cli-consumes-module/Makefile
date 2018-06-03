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
	find brymlee.messages/src -name *.java > brymlee.messages/src/java-sources.txt
	find brymlee.cli/src -name *.java > brymlee.cli/src/java-sources.txt
	find brymlee.messages/test -name *.java > brymlee.messages/test/java-sources.txt

compile-sources:
	${JAVAC} -d modules/brymlee.messages.impl --module-path modules @brymlee.messages/src/java-sources.txt
	${JAVAC} -d modules/brymlee.cli --module-path modules @brymlee.cli/src/java-sources.txt
	${JAVAC} -d modules/brymlee.messages.test --module-path modules @brymlee.messages/test/java-sources.txt

test:
	${JAVA} --module-path modules --add-modules brymlee.messages.test -m "junit/org.junit.runner.JUnitCore" brymlee.messages.test.BasicMessagesTest

run:
	${JAVA} --module-path modules -m "brymlee.cli/brymlee.cli.HelloWorldApplication"
