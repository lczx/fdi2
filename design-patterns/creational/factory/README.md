## Factory
The Factory pattern is designed to provide a way to create an object and is one of the most used design patterns in Java.

In this design pattern, we create an object without exposing its creation logic to the client and refer to the newly created object by using a common interface.

Take a close look at `shapes.ShapeFactory` to see how this pattern works. In most cases, however, we won't pass an argument to the creation method.

In any case, I discourage using Strings to identify objects, hence suggesting alternatives such as Enums.
