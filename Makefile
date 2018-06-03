all: get-java untar-java
	
get-java:
	wget https://download.java.net/java/GA/jdk10/10.0.1/fb4372174a714e6b8c52526dc134031e/10/openjdk-10.0.1_linux-x64_bin.tar.gz

untar-java:
	tar -zxvf openjdk-10.0.1_linux-x64_bin.tar.gz

