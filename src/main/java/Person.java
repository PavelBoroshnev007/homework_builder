import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private Integer age;
    private String city;


    public Person (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person (String name, String surname, int age, String city){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge(){
        return age != null;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Integer getAge() {
        if (hasAge()) {
            return age;
        }
        return null;
    }
    public String getCity() {
        if (hasAddress()) {
            return city;
        }
        return null;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public void setAddress(String address) {
        this.city = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(0)
                .setAddress(city);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }
}
