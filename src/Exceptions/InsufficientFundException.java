package Exceptions;
// Debemos decidir si nuestra excepción ser checked o unchecked:
// checked -> extend Exception class
// unchecked -> extend RuntimeException class
public class InsufficientFundException extends Exception {
    // puedes añadir un mensaje también:

    public InsufficientFundException(String message) {
        super(message);
    }
    public InsufficientFundException() {
        super("Insufficient fund.");
    }
}
