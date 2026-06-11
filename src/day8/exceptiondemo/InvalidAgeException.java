package day8.exceptiondemo;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}
