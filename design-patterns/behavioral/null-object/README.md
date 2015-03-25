## Null Object
In this pattern, a null object replaces checks against `null`.
Instead of putting in checks for null values, Null Objects reflect a *do nothing* relationship.
Such Null Object can also be used to provide a default behavior in the case that data is not available.

In the Null Object Pattern, we create an abstract class specitying the various operations to be done,
concrete classes extending this class and a Null Object class providing a *do nothing* implementation;
this class will be used seamlessy everywhere we need to check for a null value.
