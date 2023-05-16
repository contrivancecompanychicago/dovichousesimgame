public class GasSimulation extends TriforceSimulation {

    private ArrayList<Molecule> molecules;
    private Triforce triforce;

    public GasSimulation(int n) {
        molecules = new ArrayList<Molecule>();
        for (int i = 0; i < n; i++) {
            molecules.add(new Molecule());
        }
        triforce = new Triforce(1, 1);
    }

    public void step() {
        for (int i = 0; i < molecules.size(); i++) {
            for (int j = i + 1; j < molecules.size(); j++) {
                double r = molecules.get(i).getPosition().distance(molecules.get(j).getPosition());
                double force = triforce.getForce(r);
                molecules.get(i).addForce(force);
                molecules.get(j).addForce(-force);
            }
        }

        for (Molecule molecule : molecules) {
            molecule.updatePosition();
        }
    }

    public void run() {
        while (true) {
            step();
        }
    }

}
