1. You need to install GraalVM and set it as default JDK
2. In the project folder run the below command to build:
```shell
./mvnw -Pnative -DskipTests clean package
```
3. You will find the artifacts in target folder:
```shell
❯ ls -l ./target
total 84276
drwxr-xr-x 6 linyang staff      192 Mar 29 10:52 classes
drwxr-xr-x 4 linyang staff      128 Mar 29 10:52 generated-sources
drwxr-xr-x 4 linyang staff      128 Mar 29 10:52 generated-test-sources
drwxr-xr-x 3 linyang staff       96 Mar 29 10:52 maven-archiver
drwxr-xr-x 3 linyang staff       96 Mar 29 10:52 maven-status
-rwxr-xr-x 1 linyang staff 68678736 Mar 29 10:54 spring-helloworld
-rw-r--r-- 1 linyang staff 17563418 Mar 29 10:52 spring-helloworld-0.0.1-exec.jar
-rw-r--r-- 1 linyang staff    45673 Mar 29 10:52 spring-helloworld-0.0.1.jar
-rw-r--r-- 1 linyang staff       32 Mar 29 10:54 spring-helloworld.build_artifacts.txt
drwxr-xr-x 5 linyang staff      160 Mar 29 10:52 test-classes

```

4. Run it:
- Native mode:
```shell
./target/spring-helloworld
```

You'll see the output like this:
```shell
❯ ./target/spring-helloworld
2022-03-29 10:58:21.214  INFO 52649 --- [           main] o.s.nativex.NativeListener               : This application is bootstrapped with code generated with Spring AOT

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.5.11)

2022-03-29 10:58:21.216  INFO 52649 --- [           main] c.e.spring.SpringHelloworldApplication   : Starting SpringHelloworldApplication v0.0.1 using Java 11.0.13 on LINYANG-MBP-2019.local with PID 52649 (/Users/linyang/workspace/flomesh-projects/spring-helloworld/target/spring-helloworld started by linyang in /Users/linyang/workspace/flomesh-projects/spring-helloworld)
2022-03-29 10:58:21.216  INFO 52649 --- [           main] c.e.spring.SpringHelloworldApplication   : No active profile set, falling back to 1 default profile: "default"
2022-03-29 10:58:21.255  INFO 52649 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-03-29 10:58:21.256  INFO 52649 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-03-29 10:58:21.256  INFO 52649 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.60]
2022-03-29 10:58:21.260  INFO 52649 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-03-29 10:58:21.260  INFO 52649 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 43 ms
2022-03-29 10:58:21.278  INFO 52649 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-03-29 10:58:21.279  INFO 52649 --- [           main] c.e.spring.SpringHelloworldApplication   : Started SpringHelloworldApplication in 0.081 seconds (JVM running for 0.083)
```

- Normal mode:
Execute:
```shell
java -jar ./target/spring-helloworld-0.0.1-exec.jar
```

You'll see the output like this:
```shell
❯ java -jar ./target/spring-helloworld-0.0.1-exec.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.5.11)

2022-03-29 10:59:30.265  INFO 52723 --- [           main] c.e.spring.SpringHelloworldApplication   : Starting SpringHelloworldApplication v0.0.1 using Java 11.0.13 on LINYANG-MBP-2019.local with PID 52723 (/Users/linyang/workspace/flomesh-projects/spring-helloworld/target/spring-helloworld-0.0.1-exec.jar started by linyang in /Users/linyang/workspace/flomesh-projects/spring-helloworld)
2022-03-29 10:59:30.269  INFO 52723 --- [           main] c.e.spring.SpringHelloworldApplication   : No active profile set, falling back to 1 default profile: "default"
2022-03-29 10:59:31.151  INFO 52723 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-03-29 10:59:31.162  INFO 52723 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-03-29 10:59:31.162  INFO 52723 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.60]
2022-03-29 10:59:31.223  INFO 52723 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-03-29 10:59:31.224  INFO 52723 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 894 ms
2022-03-29 10:59:31.513  INFO 52723 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-03-29 10:59:31.521  INFO 52723 --- [           main] c.e.spring.SpringHelloworldApplication   : Started SpringHelloworldApplication in 1.697 seconds (JVM running for 2.137)
```