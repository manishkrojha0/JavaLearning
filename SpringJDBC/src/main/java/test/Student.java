package test;

public class Student {
    private String personID;
    private String LastName;
    private String FirstName;
    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    private String city;
    public Student()
    {
        super();
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "personID='" + personID + '\'' +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Student(String studentId) {
        personID = studentId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
}
