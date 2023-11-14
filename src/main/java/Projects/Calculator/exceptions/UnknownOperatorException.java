package Projects.Calculator.exceptions;

public class UnknownOperatorException extends RuntimeException{
    public UnknownOperatorException(String message) {
        super(message);
    }
}
