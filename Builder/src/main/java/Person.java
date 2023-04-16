public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String adress;

    public Person(String name, String surname) {

    }

    public Person(String name, String surname, int age) {

    }


    public int getAge() {
        return age;
    }


    public String getAdress() {
        return adress;
    }


    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public boolean hasAdress() {
        return adress.isEmpty();
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(lastName);
        return personBuilder;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", adress='" + adress + '\'' + '}';
    }
}
