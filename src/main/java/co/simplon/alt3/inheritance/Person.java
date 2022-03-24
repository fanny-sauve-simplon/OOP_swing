package co.simplon.alt3.inheritance;

import co.simplon.alt3.exception.SamePersonException;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String greeting(Person person) throws SamePersonException {

        if (person == this) {
           throw new SamePersonException();
        }
       
        return "Hello, "+person.name+", I'm "+name;
    }

}
