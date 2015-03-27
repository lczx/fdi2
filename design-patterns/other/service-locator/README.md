## Service Locator
This pattern is used when we want to locate various services using JNDI lookup, considering the high cost to do a JNDI lookup for a service.

Service Locator looks up in JNDI and caches the service object. Further lookups of the same service via the Service Locator is done in its cache thus improving the performance of the application.

Following are the entities of this type of design pattern:

- **Service**: Actual service which will process the request. Reference of such service is to be looked upon in a JNDI server.
- **Context** / **Initial Context**: JNDI context, carries the reference to the service used for lookup purpose.
- **Service Locator**: A single point of contact to get services by JNDI lookup, caching the services.
- **Cache**: Cache to store references of services to reuse them.
- **Client**: Client is the object who invokes the services via the Service Locator.
