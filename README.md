# Petclinic simple autotests

To run all tests use:

```concole
gradlew clean test
```

To run tests by a specific runner:

```concole
gradlew clean :junit4:test
gradlew clean :junit5:test
gradlew clean :testng:test -Pstandalone -Pmcr
gradlew clean :cucumber-junit:test -Dcucumber.filter.tags=@standalone -DtestFramework=cucumber
gradlew clean :cucumber-testng:test -Dcucumber.filter.tags=@standalone -DtestFramework=cucumber
```

## Examples of local run 

Use standalone Petclinic:
```
gradlew clean :junit4:test -DpetclinicUrl=http://localhost:8082 -DadminHost=localhost -DagentId=Petclinic --tests *.standalone.* 
gradlew clean :junit5:test -DpetclinicUrl=http://localhost:8082 -DadminHost=localhost -DagentId=Petclinic --tests *.standalone.* 
gradlew clean :testng:test -Pstandalone -DpetclinicUrl=http://localhost:8082 -DadminHost=localhost -DagentId=Petclinic -Dtestng.dtd.http=true 
```
## Test env
If you want to use test env then you need to change:

- petclinicUrl
- adminHost
- agentId

For example, for TEST stand:
```
gradle clean :testng:test -Pstandalone -DpetclinicUrl=http://ecse0050029e.epam.com:8087 -DadminHost=ecse0050029e.epam.com -DagentId=test-pet-standalone -Dtestng.dtd.http=true
```
