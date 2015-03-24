## Chain of Responsability
This pattern decouples sender and receiver of a request based on the type of the request.

In this pattern, normally each receiver contains a reference to another receiver.
If one object cannot handle the request, then it passes the same to the next receiver and so on.
