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

    // Soit vous redéfinissez typeVehicule() ou getInfo(). Voir les commentaires dans la classe Voiture.
    @Override
    public String typeVehicule() {
        return sidecar ? "Moto avec sidecar" : "Moto solo";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + (sidecar ? " sideCar" : " Moto solo");
    }
}
