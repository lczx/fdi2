## Business Delegate
The Business Delegate design pattern is used to decouple presentation and business tier; it is reduces communication or remote lookup to business tier code in the presentation tier code.

We have the following entries:

- **Client**: Presentation tier code that may be JSP, servlets or UI java code.
- **Business Delegate**: A single entry point class for client entities to provide access to Business Service methods.
- **Lookup Service**: This object is responsible to get the relative business implementation and provide Business object access to the Business Delegate.
- **Business Service**: The Business Service interface; concrete classes implement this business service to provide actual business implementation logic.
