package co.com.sofka.exception;

public class ValidationTextDoesNotMatch extends AssertionError{
    public static final String VALIDATION_DOES_NOT_MATCH="The validation doesn't match. %s";

    public ValidationTextDoesNotMatch(String message, Throwable cause) {
        super(message, cause);
    }
}
