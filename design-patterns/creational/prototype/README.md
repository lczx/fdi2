## Prototype
This pattern allows to create duplicate objects while keeping performance. It works by implementing a prototype interface holding a method to create a clone of the current object.

The Prototype pattern is usually used when direct creation of an object is considered costly: for example, an object created as a result from a database query.
With this, we can cache the object and return a clone of it to the next requests, thus reducing database queries.
