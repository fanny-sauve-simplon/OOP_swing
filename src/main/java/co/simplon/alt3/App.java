package co.simplon.alt3;

import co.simplon.alt3.inheritance.Person;
import co.simplon.alt3.inheritance.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        

        Person person = new Student("Jean", "jean@jean.jean", "0123456789", "CDA",
        3);

        System.out.println(person.greeting(null));

    }
}
