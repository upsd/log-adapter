# Adapter Pattern
Imagine you are using a library to log out messages within your application. This library is 
[Log4](./src/main/java/Log4Life.java), you use it like the below:
```java
Log4 logger = new Log4Life();
logger.log("I am logging");
```
The authors of this library release a new one entitled [Log5](./src/main/java/Log5Live.java) and can be used as per the
below:
```java
Log5 logger = new Log5Live();
logger.log("I am logging", false);
```

As you can see, there is a difference in the method signature of `log` between versions. To get around this we can wrap
the logic for using the new logger, meaning minimal code in our current application should not have to change. The
wrapping is performed by an [adapter](./src/main/java/LogAdapter.java).

With the use of our adapter, we can call our new logger with minimal changes:
```java
Log4 logger = new LogAdapter(true);
logger.log("I am logging");
```