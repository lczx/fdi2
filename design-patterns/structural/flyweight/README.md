## Flyweight
The Flyweight pattern is primarily used to reduce the number of objects created,
thus decreasing memory footprint and increase performance.

This pattern tries to reuse already existing similar kind of objects by storing them
and creates new objects when no matching object is found.

In this example we are drawing 20 circles in different locations of the screen
but we are going to create only 5 objects. Only 5 colors are available so the color
property is used to check if a corresponding circle object already exists.
