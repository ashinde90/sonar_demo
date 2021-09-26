This example demonstrates how to analyze a simple Java Maven project.

![](https://travis-ci.org/mebusw/maven-sonar-example.svg)

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 2.12 or higher
* Maven 2.2.1 or higher
* [SonarQube Cobertura Plugin 1.6.3+](http://docs.sonarqube.org/display/PLUG/Cobertura+Plugin)

Usage
=====
* Build the project:

        mvn clean install

* Run tests:

        mvn test

* Run tests with coverage analysis:

        mvn cobertura:cobertura -Dcobertura.report.format=xml

* Analyze it with SonarQube using Maven:

        mvn sonar:sonar

References
==========

https://github.com/SonarSource/sonar-examples/blob/master/projects/languages/java/code-coverage/ut/ut-maven-cobertura/pom.xml
