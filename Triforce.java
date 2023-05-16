public class Triforce extends DovicHouseScene {

    private double epsilon;
    private double sigma;

    public Triforce(double epsilon, double sigma) {
        this.epsilon = epsilon;
        this.sigma = sigma;
    }

    public double getPotentialEnergy(double r) {
        return 4 * epsilon * ((sigma / r) ** 12 - (sigma / r) ** 6);
    }

    public double getForce(double r) {
        return -12 * epsilon * ((sigma / r) ** 13 - (sigma / r) ** 7);
    }

    public void draw() {
        // Draw the Triforce in Java.
    }

}
