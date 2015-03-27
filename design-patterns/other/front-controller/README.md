## Front Controller
This design pattern is used to provide a centralized request handling mechanism so that all requests will be handles by a single handler.
This handler can do authentication, authorization, logging or tracking of requests and then pass them to the corresponding handlers.

Here we have the pattern's entitites:

- **Front Controller**: A single handler for all the kind of requests coming to the application (either web based or desktop based).
- **Dispatcher**: The front controller may use a dispatcher object which can dispatch requests to the corresponding specific handler.
- **View**: Views are the objects for which the requests are made.
