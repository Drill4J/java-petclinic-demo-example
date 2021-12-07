# Drill4J: Java setup

This repository demonstrates how Drill4J enables various metrics collection (including coverage) for backend application across multiple builds

The demo is based on [Petclinic example apps](https://github.com/Drill4J/spring-petclinic)

## Notes

1. This is not installation guidelines. For the installation instructions, please refer to the documentation on [Drill4J Website](https://drill4j.github.io/docs/installation/drill-admin)

## Setup overview

1. These are example applications, think of them as "target" applications which you want to collect metrics from.

2. It is forked and modifed to enable Drill4J integration
    - [Backend API service](https://github.com/Drill4J/spring-petclinic)

3. Additionally, [Drill4J Backend Admin API service](http://localhost:8091) and [Drill4J Admin Panel](http://localhost:8091) are deployed.

## Running demo

### Deploy Drill4J services and the **1-st** application build

1. Launch Drill4J services & deploy 1-st application build

    ```shell
    ./demo-up.sh
    ```

2. Open [Example Application](http://localhost:8087) and wait until it becomes available

3. Open [Drill4J Admin Panel](http://localhost:8091). Register agent.

   > There is no need to specify any parameters during the registration, just click through steps leaving everything as-is.

### Run tests for the **1-st** application build

1. Run

    ```shell
    ./gradlew clean :junit4:test --tests *.standalone.*
    ```

2. Wait for tests to complete

3. Open [Drill4J Admin Panel](http://localhost:8091) to see the result

4. Finish scope


### Deploy the **2-nd** application build

1. Deploy the 2-nd application build

    ```shell
    ./demo-deploy-build2.sh
    ```

2. Wait for build notification to appear (click the Bell icon in the top-right corner of the page)

3. **Optional**: Click on the "Dashboard" button inside notification to explore the new build. See how Drill4J detected new, modified and deleted methods

### Run tests for the **2-nd** application build

1. Run tests by

    ```shell
    ./gradlew clean :junit4:test --tests *.standalone.*
    ```

2. Wait for tests to complete

3. Open [Drill4J Admin Panel](http://localhost:8091) to see the result

4. Finish scope


## Teardown

1. To remove demo setup run

  ```shell
  ./demo-down.sh
  ```



----
----

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

