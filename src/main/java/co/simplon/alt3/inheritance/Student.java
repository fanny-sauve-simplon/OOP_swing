package co.simplon.alt3.inheritance;

import co.simplon.alt3.exception.SamePersonException;

public class Student extends Person {
    private String professionalTitle;
    private int promoNumber;
    
    public Student(String name, String email, String phoneNumber, String professionalTitle, int promoNumber) {
        super(name, email, phoneNumber);
        this.professionalTitle = professionalTitle;
        this.promoNumber = promoNumber;
    }


    public String learnStuff() {
        return "I'm learning to pass my title : "+professionalTitle;
    }

    @Override
    public String greeting(Person person) throws SamePersonException {
        return super.greeting(person) + ", I'm a student in"+professionalTitle;
    }

    
}
