## Composite Entity
Usually used in EJB persistence mechanism, a Composite Entity is an EJB entity bean which represents a graph of objects. When a composite entity is updated, internally dependent object beans get updated automatically as being managed by the EJB entity bean.

It is composed of:

- **Composite Entity**: It is the primary entity bean, can be coarse grained or can contain a coarse grained object to be use for persistence purposes.
- **Coarse-Grained Object**: This object contains dependent objects. It has its own life cycle and also manages life cycle of dependent objects.
- **Dependent Object**: The Dependent Object is an object which depends on a coarse grained object for its persistence lifecycle.
- **Strategies**: Strategies represent how to implement a Composite Entity.
