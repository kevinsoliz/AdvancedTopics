package Generics;

public class Main {
    public static void main(String[] args) {
        var user = new GenericList<User>();
        user.add(new User(10)); //Boxing la Java Compiler va a poner dentro de una caja.
        User number = user.get(0); //Unboxing

    }
}
