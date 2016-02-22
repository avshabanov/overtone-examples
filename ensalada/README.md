
# What is it?

Maven example using clojure, overtone and [https://github.com/talios/clojure-maven-plugin](clojure-maven-plugin).

# How to build uber jar

```
mvn clean compile package -Passembly
```

# How to start

Once application is built use ``java -jar target/ensalada-1.0-SNAPSHOT.jar``

Alternatively use ``mvn exec:java`` if you don't want to build uber jar.
