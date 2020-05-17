# Servlet 4 Features

The project shows how to work with new Servlet4 features in Tomcat9.

### Spring-boot
PushBuilder already implemented in <a href="https://github.com/StepanMelnik/HelloSpringFramework/tree/master/hello-spring-framework-mvc">https://github.com/StepanMelnik/HelloSpringFramework/tree/master/hello-spring-framework-mvc</a> project.

Just clone the project and perform all steps specified in "Servlet 4.0 support" section. 

### Native tomcat
The best way is to test PushBuilder directly in Tomcat9 with enabled SSL configuration as described in <a href="https://github.com/StepanMelnik/HelloSpringFramework/tree/master/hello-spring-framework-mvc">https://github.com/StepanMelnik/HelloSpringFramework/tree/master/hello-spring-framework-mvc</a> project.

### Cargo-maven2-plugin
Tomcat container can be started with ''cargo-maven2-plugin'' as described in pom.

## Build
  mvn package
  mvn org.codehaus.cargo:cargo-maven2-plugin:run
