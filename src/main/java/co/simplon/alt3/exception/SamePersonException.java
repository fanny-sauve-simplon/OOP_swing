package co.simplon.alt3.exception;

public class SamePersonException extends Exception {
    public SamePersonException() {
        super("A person cannot interact with itself");
    }
}
