## Data Access Object
The DAO pattern is used to separate low level data accessing APIs or operations from high level business services.
The following entities partecipate in this pattern:

- **Data Access Object interface**: This interface defines the standard operations to be performed on a model object(s).
- **Data Access Object concrete class**: This class implements the above interface. It is responsible to get data from a data source which can be a database, an XML file or any other storage mechanism.
- **Model Object** or **Value Object**: This object is a simple POJO containing get / set methods to store data retrieved using the DAO class.
