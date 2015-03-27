## Intercepting Filter
The Intercepting Filter design pattern is used when we want to do some pre-processing / post-processing with a request or response from the application.

Filters are defined and applied on the request before passing it to the actual target application. Filters can do the authentication, authorization, logging or tracking of the request and then pass it to the corresponding handlers.

Here we have the entities partecipating in this design pattern:

- **Filter**: The filter which will perform a certain task prior or after execution of a request by a request handler.
- **Filter Chain**: A filter chain carries multiple filters and helps to execute them in a defined order on the target.
- **Target**: The request handler.
- **Filter Manager**: It manages the filters and the Filter Chain.
- **Client** The client is the object who sends requests to the target object.
