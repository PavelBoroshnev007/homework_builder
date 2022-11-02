public class PersonBuilder {

    private String name;
    private String surname;
    private Integer age;
    private String city;



    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(Integer age) {
        if (age < 0 || age > 200){
            throw new IllegalArgumentException("Возраст недопустимый");
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null && surname == null) {
            throw new IllegalStateException("Не хватает обязательных данных!");
        }

        Person person = new Person(name, surname, age);
        person.setAddress(city);

        return person;
    }
}
