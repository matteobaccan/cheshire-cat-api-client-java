# cheshire-cat-api-client-java

Cheshire Cat AI - Java client

This project consists of 3 modules:

- [cheshire-cat-java-client-generator](cheshire-cat-java-client-generator) - The Java client generator, which starts from OpenAPI definitions
- [cheshire-cat-java-client](cheshire-cat-java-client) - The Java client produced by the generation process
- [cheshire-cat-java-client-test](cheshire-cat-java-client-test) - An API testing environment

## Requirements

- Java 8 or higher
- Maven 3.2.0 or higher

## Current version

Current library version is aligned to 1.9.2 version of Cheshire Cat API.

## Building the project

To build the entire project:

```bash
mvn clean install
```

To run tests:

```bash
mvn test
```

To verify the build:

```bash
mvn verify
```

## Usage

Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>it.baccan</groupId>
    <artifactId>cheshire-cat-java-client</artifactId>
    <version>1.9.2</version>
</dependency>
```

## CheshireCat

For more information about the Cat, visit [https://github.com/cheshire-cat-ai](https://github.com/cheshire-cat-ai)
