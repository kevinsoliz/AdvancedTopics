package Exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (IOException e) {
            System.out.println("An unexpected error occured."); //mensaje de error genérico.
        }

        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException  e) {
           var cause = e.getCause();
            System.out.println(cause.getMessage()); // y asi tiens tu mensaje del error especifico!
        }
    }
}
