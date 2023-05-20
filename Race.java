import java.util.Random;

public class Race extends Character {

    private String[] food;

    public Race() {
        food = new String[10];
    }

    public void gatherFood() {
        // Get a random number between 1 and 10
        Random random = new Random();
        int number = random.nextInt(10) + 1;

        // If the number is 1, 2, or 3, the race gathers wheat
        if (number <= 3) {
            food[number - 1] = "wheat";
        }

        // If the number is 4, 5, or 6, the race gathers corn
        else if (number <= 6) {
            food[number - 1] = "corn";
        }

        // If the number is 7, 8, or 9, the race gathers potatoes
        else if (number <= 9) {
            food[number - 1] = "potatoes";
        }

        // If the number is 10, the race gathers nothing
        else {
            food[number - 1] = "";
        }
    }

    public String[] getFood() {
        return food;
    }

    public static void main(String[] args) {
        Race redRace = new Race();
        Race greenRace = new Race();

        redRace.gatherFood();
        greenRace.gatherFood();

        System.out.println("The Red race gathered: " + redRace.getFood());
        System.out.println("The Green race gathered: " + greenRace.getFood());
    }
}
