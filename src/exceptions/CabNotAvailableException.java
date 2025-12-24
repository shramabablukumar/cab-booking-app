package exceptions;

public class CabNotAvailableException extends RuntimeException {
    public CabNotAvailableException(String message) {
        super(message);
    }
}