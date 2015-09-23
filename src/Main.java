import ua.com.mamutiks.objects.Person;

/**
 * Created by user on 9/23/15.
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person.Builder()
                .firstName("Jack")
                .lastName("Donald")
                .age(18)
                .build();

        Person personCopy = new Person.Builder()
                .firstName("John")
                .lastName("Donald")
                .age(25)
                .build();

        System.out.println(person.toString());
        System.out.println(personCopy.toString());

    }

}
