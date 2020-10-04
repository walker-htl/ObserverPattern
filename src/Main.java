import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Understanding Java Observable and JavaFX Observable
        // see: https://www.developer.com/java/data/understanding-java-observable-and-javafx-observable.html

        PeopleObservable damsel = new PeopleObservable("Minnie");
        PeopleObserver mickey = new PeopleObserver("Mickey");
        PeopleObserver donald = new PeopleObserver("Donald");
        PeopleObserver goofy = new PeopleObserver("Goofy");

        damsel.addObserver(mickey);
        damsel.addObserver(donald);
        damsel.addObserver(goofy);

        System.out.println("There are " + damsel.countObservers()
                + " observers of "
                + damsel.getName());

        Random r = new Random();
        damsel.wink(r.nextInt(10));
    }
}
