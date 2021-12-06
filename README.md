# Petclinic simple autotests

To run tests use:

```concole
gradlew clean :junit4:test
```

## Examples of local run 

Use standalone Petclinic:
```
gradlew clean :junit4:test -DpetclinicUrl=http://localhost:8082 -DadminHost=localhost -DagentId=ExampleAgent --tests *.standalone.* 

```
## Test env
If you want to use test env then you need to change:

- petclinicUrl
- adminHost
- agentId

