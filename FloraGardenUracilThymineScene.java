import java.util.Random;

public class FloraGardenUracilThymineScene extends Chicagolike {

    private String name;
    private String description;
    private Random random;

    public Scene(String name, String description) {
        this.name = name;
        this.description = description;
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Random getRandom() {
        return random;
    }

    public void generateRandomEncounter() {
        int encounterType = random.nextInt(3);

        switch (encounterType) {
            case 0:
                // Wild Boar
                System.out.println("You encounter a wild boar!");
                break;
            case 1:
                // Skittery Spider
                System.out.println("You encounter a skittery spider!");
                break;
            case 2:
                // Crazy Villager
                System.out.println("You encounter a crazy villager!");
                break;
        }
    }

    public void generateRandomCharacter() {
        int characterType = random.nextInt(4);

        switch (characterType) {
            case 0:
                // Green Race
                System.out.println("You create a green race character!");
                break;
            case 1:
                // Red Race
                System.out.println("You create a red race character!");
                break;
            case 2:
                // Link
                System.out.println("You create a Link character!");
                break;
            case 3:
                // Zelda
                System.out.println("You create a Zelda character!");
                break;
        }
    }

    public void generateRandomFaction() {
        int factionType = random.nextInt(2);

        switch (factionType) {
            case 0:
                // House of KEGG
                System.out.println("You join the House of KEGG!");
                break;
            case 1:
                // The Resistance
                System.out.println("You join the Resistance!");
                break;
        }
    }

    public void generateRandomSkillTree() {
        System.out.println("You create a skill tree!");
    }

    public void generateRandomDialogue() {
        System.out.println("You create a piece of dialogue!");
    }

    public void generateRandomInteractiveEnvironment() {
        System.out.println("You create an interactive environment!");
    }

    public void generateRandomMinigame() {
        System.out.println("You create a minigame!");
    }

    public void generateRandomPuzzle() {
        System.out.println("You create a puzzle!");
    }

}
