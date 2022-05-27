# microsoft-dynamics-finance-client
<a href="https://github.com/davidmoten/microsoft-dynamics-finance-client/actions/workflows/ci.yml"><img src="https://github.com/davidmoten/microsoft-dynamics-finance-client/actions/workflows/ci.yml/badge.svg"/></a><br/>
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.davidmoten/microsoft-dynamics-finance-client-runtime/badge.svg?style=flat)](https://maven-badges.herokuapp.com/maven-central/com.github.davidmoten/microsoft-dynamics-finance-client)<br/>
[![codecov](https://codecov.io/gh/davidmoten/microsoft-dynamics-finance-client/branch/master/graph/badge.svg)](https://codecov.io/gh/davidmoten/microsoft-dynamics-finance-client)<br/>

This is a java client for the Microsoft Dynamics Finance and Operations API and is built using [odata-client](https://github.com/davidmoten/odata-client).

## Getting started 
```
mvn clean install
```
At that point you will have a newly built jar in the target directory `microsoft-dynamics-finance-client-0.1-SNAPSHOT.jar`. 

Note that the Finance and Operations OData [metadata](src/main/odata/microsoft-dynamics-finance-metadata.xml) is large (28M) and as a consequence there are lots of generated classes too. The jar is about 29M. You could trim your metadata but that gets complex because of all the intertwined dependencies in the data model. If you do need to reduce the jar size to just support the functionality you need then I suggest building an uber jar with your code and this library and shrinking it with [ProGuard](https://github.com/wvengen/proguard-maven-plugin). 

Dynamics allows you to extend the base functionality of the system. When you do so replace the file `src/main/odata/microsoft-dynamics-finance-metadata.xml` with your service metadata and rebuild the client so you can access your new functionality using type-safe Java code.

## Usage
See [DynamicsMain.java](/src/test/java/com/github/davidmoten/ms/dynamics/DynamicsMain.java) for usage.

Once confirmed as working I'll probably deploy this to Maven Central.
