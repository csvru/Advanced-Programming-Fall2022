package data.people;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Enum<Gender> gender;

    public Person(String firstName, String lastName, int age, Enum<Gender> gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return  this.firstName + " " + this.lastName;
    }

    public String getPrefix() {
       return this.gender == Gender.MALE ? "Mr." : "Mrs.";
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getPrefix(), getFullName());
    }
}
