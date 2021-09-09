package examples;

public class Application {
    public static void main(String[] args) {
        Person person = new Person();

        person.exercise(new Biking(), new Duration());
        person.exercise(new Rowing(), new Duration());
        person.die(false, false);
    }
}
