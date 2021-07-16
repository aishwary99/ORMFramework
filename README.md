# ORMFramework

## Description
An object relational mappings i.e ORM is a framework that gives facilities related to SQL on backend to ease data layer work. The framework is developed in Java and
having usage of Java's Reflection API & Collections Framework. User who is using the ORM Framework doesn't need to bother about writing hundred's of thousand's of SQL 
code to push & pull data from database. Along with this , user doesn't need to worry about writing POJO (Entity) classes with appropriate annotatins. Our framework will
take care of creating POJO's all from scratch just by analyzing Tables & will do proper structuring along with class level & field level annotations.

### Features
* POJO Generator
* Custom Annotations
* Overcomes the headache of writing SQL
* Single JAR availability so you just have to include it in classpath & do magic

### Installing

* Install JDK 1.8 on your local machine
* Download the ORM.jar from master branch & put it in your libs of working directory
* Install MYSQL version 8 to overcome some minor bugs & errors
* Include ORM.jar at compile time & runtime
* Create conf.json file in current working directory having JSON formatting similar to conf.json of master branch

## Version History
* 0.2 - Upcoming
    * Logger facility
* 0.1
    * Initial Release

## Acknowledgments

* https://github.com/google/gson
* https://docs.oracle.com
