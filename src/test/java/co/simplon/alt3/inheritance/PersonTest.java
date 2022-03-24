package co.simplon.alt3.inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import co.simplon.alt3.exception.SamePersonException;

public class PersonTest {
    @Test
    void greetingShouldReturnSentence() throws SamePersonException {
        Person person = new Person("test","test@test", "0123456789");
        Person target = new Person("test2", "test2@test", "2345678901");
        String expected = "Hello, test2, I'm test";

        assertEquals(expected, person.greeting(target));
    }

    @Test
    void personCannotGreetItself() {

        Person person = new Person("test","test@test", "0123456789");

        assertThrows(SamePersonException.class, () -> person.greeting(person));
        
    }
}
