import game.Sheep;
import game.Wolf;

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(1110, 12, 3);
        Wolf wolf = new Wolf(10, 10, 1);
        System.out.println("Убийство овцы заняло: " + wolf.muchaemovtsu(sheep) + " секунды");
    }
}