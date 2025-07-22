package Exceptions;

import java.io.IOException;

public class Account {
    private float balance;
    public void deposit(float value) throws IOException {
        if (value < 0)
            throw new IOException();
    }
    //Channing exceptions: wrapping an exception inside a more general exception. Se usa sobre todo para
    // construir libraries and frameworks.
    public void withdraw(float value) throws AccountException {
        if(value > balance) {
            //Hay una manera más sencilla de escribir todo este código (en la AccountException);
            var fundsException = new InsufficientFundException();
            var accountException = new AccountException();
            accountException.initCause(fundsException);
            throw accountException;
        }
    }


}
