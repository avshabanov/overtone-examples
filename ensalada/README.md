
# What is it?

Maven example using clojure, overtone and [https://github.com/talios/clojure-maven-plugin](clojure-maven-plugin).

# First steps (build prerequisite)

**NOTE!!!** Overtone creators didn't publish their build artifacts into maven repository, so you have to build them yourself.

Steps:
* Checkout overtone sources: ``git clone https://github.com/overtone/overtone/``
* Build them
** Go to overtone folder, use ``lein jar``
** If you don't have leiningen installed, install it before building overtone, e.g. ``brew install leiningen``
* Install overtone jar to your maven repo,
don't use snapshot version unless you *really* want to change overtone:
``mvn install:install-file -Dpackaging=jar -Dfile=target/overtone-0.10-SNAPSHOT.jar -DgroupId=overtone -DartifactId=overtone -Dversion=0.1``


# How to build uber jar

```
mvn clean compile package -Passembly
```

# How to start

Once application is built use ``java -jar target/ensalada-1.0-SNAPSHOT.jar``

Alternatively use ``mvn exec:java`` if you don't want to build uber jar.

See also [https://github.com/overtone/overtone/wiki/Installing-Overtone](overtone install tutorial).

# Known overtone issues:

* Mac OS X: input and output rates don't match, refer to [https://github.com/overtone/overtone/issues/83](overtone issue #83) for solution.

