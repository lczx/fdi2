## Transfer Object
This pattern is used when we want to pass data with multiple attributes in one shot from client to server. The pattern is also known as Value Object.

The Transfer Object is a simple POJO class having getter and setter methods and no behaviors; it is also serializable, so it can be transferred over the network.

The server side Business Class normally fetches data from the database, fills the POJO and sends it to the client (or passes it by value).

For the Client, the Transfer Object is read only. The Client can create its own Transfer Object and pass it to the server to update values inside the database in one single shot.

Here we have the entities of the Transfer Object design pattern:

- **Business Object**: Business service which fits the Transfer Object with data.
- **Transfer Object**: Simple Plain Old Java Object (POJO) having setters, getters and attributes only.
- **Client**: The entity that either requires or sends the Transfer Object to the Business Object.
