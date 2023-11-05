# open-api-playground

Playground for open-api.

## Links

* [Swagger UI](http://localhost:8080/swagger-ui/index.html#/pets/patchPet)

![openapi-logo](docs/openapi-logo.png)
## Sources

* Generator
  * [Documentation for the spring Generator | OpenAPI Generator](https://openapi-generator.tech/docs/generators/spring/)
  * [Open API Server Implementation Using OpenAPI Generator | Baeldung](https://www.baeldung.com/java-openapi-generator-server)
  * [OpenAPITools/openapi-generator: OpenAPI Generator allows generation of API client libraries (SDK generation), server stubs, documentation and configuration automatically given an OpenAPI Spec (v2, v3)](https://github.com/OpenAPITools/openapi-generator)
    * [openapi-generator/modules/openapi-generator-maven-plugin at master · OpenAPITools/openapi-generator](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-maven-plugin)
* Banner
  * [Create ASCII text banners online](https://manytools.org/hacker-tools/ascii-banner/)
* Problems with onOf etc
  * [[Java] Swagger oneOf type: Jackson trying to instantiate interface instead of implementation? · Issue #10011 · swagger-api/swagger-codegen](https://github.com/swagger-api/swagger-codegen/issues/10011)
  * [[BUG][SPRING] oneOf type: Jackson trying to instantiate interface instead of implementation · Issue #15082 · OpenAPITools/openapi-generator](https://github.com/OpenAPITools/openapi-generator/issues/15082)
* Spring Doc
  * [OpenAPI 3 Library for spring-boot](https://springdoc.org/)


## Request-Payloads for patch 

````json
{
  "animal": {
    "refType": "Cat",
    "hunts": true,
    "age": 2
  },
  "name": "Jerry"
}
````
````json
{
  "animal": {
    "bark": true,
    "breed": "Dingo",
    "refType": "Dog"
  },
  "name": "Hasso"
}
````
