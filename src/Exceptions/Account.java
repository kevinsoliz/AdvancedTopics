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
        if(value > balance)
            throw new AccountException(new InsufficientFundException());
        //estamos lanzando un account exception CAUSADO por un InsufficientFund..
    }


}
