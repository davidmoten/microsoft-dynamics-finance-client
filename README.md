# microsoft-dynamics-finance-client
<a href="https://github.com/davidmoten/microsoft-dynamics-finance-client/actions/workflows/ci.yml"><img src="https://github.com/davidmoten/microsoft-dynamics-finance-client/actions/workflows/ci.yml/badge.svg"/></a><br/>
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.davidmoten/microsoft-dynamics-finance-client-runtime/badge.svg?style=flat)](https://maven-badges.herokuapp.com/maven-central/com.github.davidmoten/microsoft-dynamics-finance-client)<br/>
[![codecov](https://codecov.io/gh/davidmoten/microsoft-dynamics-finance-client/branch/master/graph/badge.svg)](https://codecov.io/gh/davidmoten/microsoft-dynamics-finance-client)<br/>

This is a java client for the Microsoft Dynamics Finance and Operations API and is built using [microsoft-dynamics-finance-client](https://github.com/davidmoten/microsoft-dynamics-finance-client).

To build 
```
mvn clean install
```
At that point you will have a newly built jar in the target directory `microsoft-dynamics-finance-client-0.1-SNAPSHOT.jar`. 

Note that the Finance and Operations OData metadata is large (28M) and of course there are lots of generated classes too. The jar is about 29M. You could trim your metadata but that gets complex because of all the intertwined dependencies in the data model. If you do need to reduce the jar size to just support the functionality you need then I suggest using [ProGuard](https://github.com/wvengen/proguard-maven-plugin). 

