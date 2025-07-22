package Generics;

public class Main {
    public static void main(String[] args) {
        var numbers = new GenericList<Integer>();
        numbers.add(1); //Boxing la Java Compiler va a poner dentro de una caja.
        int number = numbers.get(0); //Unboxing

    }
}
