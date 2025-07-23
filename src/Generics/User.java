package Generics;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;
    }
    //Para que puedan verse los puntos hay que override the toString method:
    @Override
    public String toString() {
        return points + " Points";
    }
}
