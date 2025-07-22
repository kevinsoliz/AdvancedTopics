package Exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging"); //En apps reales cuando capturamos estas excepciones queremos log them en algún lugar,
            throw e;                        //en algún archivo, en una base de datos, etc. Para que en el futuro podamos ver qué
                                            //errores hubieron en nuestra app.

            //También vamos a necesitar mostrar ese error al usuario, de modo que hay que rethrowing la excepción.
        }
    }

}
