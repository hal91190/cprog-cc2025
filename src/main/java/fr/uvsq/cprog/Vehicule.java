package fr.uvsq.cprog;

/**
 * Une classe abstraite pour les véhicules.
 */
public abstract class Vehicule {
    private String marque;
    private int annee;

    public Vehicule(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
    }

    public abstract String demarrer();

    public String getInfo() {
        return marque + " (" + annee + ")";
    }

    public String typeVehicule() {
        return "Véhicule générique";
    }
}
