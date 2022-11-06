package data.people;

import data.fake.ir.Name;
import tools.booleans.RandomBoolean;
import tools.numbers.RandomNumber;

import java.util.ArrayList;

public class People {
    private final ArrayList<Person> list;

    public People() {
        this.list = new ArrayList<>();
    }
    public static People generate(int count) {
        People people = new People();
        for (int i = 1; i <= count; i++) {
            String firstName = Name.getRandomWomanName();
            String lastName = Name.getRandomLastName();
            Gender gender = Gender.FEMALE;
            int age = RandomNumber.integer(90) + 1;
            if(RandomBoolean.rand()) {
                firstName = Name.getRandomManName();
                gender = Gender.MALE;
            }
            people.list.add(new Person(firstName, lastName, age, gender));
        }
        return people;
    }

    public Person[] getListArray() {
        return this.list.toArray(new Person[0]);
    }

    public ArrayList<Person> getList() {
        return this.list;
    }

    public ArrayList<String> getFirstNamesList() {
        ArrayList<String> firstNames = new ArrayList<>();
        list.forEach(Person -> firstNames.add(Person.getFirstName()));
        return firstNames;
    }

    public ArrayList<String> getLastNamesList() {
        ArrayList<String> lastNames = new ArrayList<>();
        list.forEach(Person -> lastNames.add(Person.getLastName()));
        return lastNames;
    }

    public ArrayList<String> getFullNameList() {
        ArrayList<String> fullNames = new ArrayList<>();
        list.forEach(Person -> fullNames.add(Person.getFullName()));
        return fullNames;
    }

    public String[] getFirstNamesArray() {
        return this.getFirstNamesList().toArray(new String[0]);
    }

    public String[] getLastNamesArray() {
        return this.getLastNamesList().toArray(new String[0]);
    }

    public String[] getFullNameArray() {
        return this.getFullNameList().toArray(new String[0]);
    }
}