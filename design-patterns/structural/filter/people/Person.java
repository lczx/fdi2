package people;

public class Person {
    
    private String name, gender, maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        return String.format("Person: [Name: %s, Gender: %s, Marital status: %s]", name, gender, maritalStatus);
    }

}
