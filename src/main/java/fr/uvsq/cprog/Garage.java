package fr.uvsq.cprog;

public class Garage {
    public String faireDemarrer(Vehicule v) {
        return String.format("%s fait %s !", v.typeVehicule(), v.demarrer());
    }
}
