
import java.util.ArrayList;

public class BirdTest {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();

        birds.add(new Parrot("Polly", "African Grey", 20, "Grey"));
        birds.add(new Eagle("Baldy", "Bald Eagle", 72, "North America"));
        birds.add(new Parrot("Polly", "African Grey", 20, "Grey"));

        // Loop through birds and demonstrate polymorphism
        for (Bird b : birds) {
            System.out.println(b); // Calls overridden toString()
            b.fly(); // Calls overridden fly() method
        }

        // Checking equality
        System.out.println("\nComparing birds:");
        System.out.println("birds.get(0) equals birds.get(2): " + birds.get(0).equals(birds.get(2))); // true
        System.out.println("birds.get(0) equals birds.get(1): " + birds.get(0).equals(birds.get(1))); // false
    }
}
