# JavaAddinDemo

Demo of JavaAddin with very basic functionality

# Build

1) Install Maven
2) Add Notes.jar to your maven repo, that will make it accessible to Maven

```
mvn install:install-file -Dfile=path\to\Notes.jar
```

3) Build JavaAddinDemo.jar

```
mvn package
```

This should create a JavaAddinDemo.jar for you which you can deploy on Domino server after all.

# How to register JavaAddinDemo on Domino server

1) Upload file to Domino server (on Windows it's in the Domino executable folder).

JavaAddin\JavaAddinDemo.jar

2) Register Java addin in Domino environment (if you already have Addins there, keep in mind that separator is semicolon on Windows and colon on Linux) 

```
JAVAUSERCLASSES=.\JavaAddin\JavaAddinDemo.jar
```

# How to run JavaAddinDemo

```
load runjava JavaAddinDemo
```

# Example of commands

```
tell JavaAddinDemo help
```

```
tell JavaAddinDemo info
```

```
tell JavaAddinDemo quit
```
