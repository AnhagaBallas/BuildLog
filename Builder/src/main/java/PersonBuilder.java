public class PersonBuilder {
    private Person person = new Person(null, null);

    public PersonBuilder setName(String firstName) {
        person.firstName = firstName;
        return this;
    }

    public PersonBuilder setSurname(String lastName) {
        person.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > 0 && age < 100) {
            person.age = age;
            return this;
        } else {
            throw (new IllegalArgumentException("Неккоректное значение age = " + age));

        }
    }

    public PersonBuilder setAddress(String address) {
        person.adress = address;
        return this;
    }

    public Person build() {
        if (person.firstName != null && person.lastName != null) {
            return person;
        } else throw new IllegalStateException("Обязательные поля обьекта не заполнены");
    }
}