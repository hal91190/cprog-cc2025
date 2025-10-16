package fr.uvsq.cprog;

public class Moto extends Vehicule {
    private boolean sidecar;

    public Moto(String marque, int annee, boolean sidecar) {
        super(marque, annee);
        this.sidecar = sidecar;
    }

    @Override
    public String demarrer() {
        return "Broom...";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + (sidecar ? " sideCar" : " Moto solo");
    }
}
