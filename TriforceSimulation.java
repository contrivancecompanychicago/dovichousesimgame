public class TriforceSimulation extends Triforce {

    private Triforce triforce;
    private ArrayList<Molecule> molecules;

    public TriforceSimulation(int n) {
        triforce = new Triforce(1, 1);
        molecules = new ArrayList<Molecule>();
        for (int i = 0; i < n; i++) {
            molecules.add(new Molecule());
        }
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
