## Bridge
The Bridge pattern is used where we need to decouple an abstraction from
its implementation so that the two can vary indipendently.

This involves an interface, acting as a bridge, which makes the functionality
of concrete classes indipendent from interface implementers.
Both types of classes can be altered structurally without affecting each other.

In this example, a `Circle` can be drawn in different colors using the same
abstract class method but different bridge implementers.
