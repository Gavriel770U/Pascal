cd src
javac -d ../build *.java
cd ../build
jar cfm GCMD.jar MANIFEST.MF *.class