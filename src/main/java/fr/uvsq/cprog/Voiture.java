package fr.uvsq.cprog;

public class Voiture extends Vehicule {
    // La classe Voiture est une sous-classe de Véhicule
    // donc on ne répète pas les attributs marque et annee ici
    private int nbPortes;

    public Voiture(String marque, int annee, int nbPortes) {
        // Pour initialiser les attributs de la superclasse
        // on invoque son constructeur avec super(...)
        // Cela doit être la première instruction du constructeur
        // en tout cas pour les versions de Java antérieures à Java 25
        // (cf JEP 513 https://openjdk.org/jeps/513)
        super(marque, annee);
        this.nbPortes = nbPortes;
    }

    // Avec l'annotation @Override on indique que l'on redéfinit
    // la méthode demarrer() de la superclasse
    // Cela permet au compilateur de vérifier que l'on respecte
    // bien le contrat de la méthode redéfinie
    // (même type de retour, même nom, mêmes paramètres)
    @Override
    public String demarrer() {
        // La méthode retourne une chaîne de caractères
        // Attention à ne pas confondre avec un affichage System.out.println(...)
        return "Vroom...";
    }

    // Cette méthode renvoie un texte qui, en cas de spécialisation de la classe,
    // n’est plus adéquat pour les classes filles.
    @Override
    public String typeVehicule() {
        return "Voiture (" + nbPortes + " portes)";
    }

    // Vous pouvez redéfinir la méthode getInfo()
    // si vous souhaitez lui donner un comportement particulier.
    // Il n’est pas obligatoire de la redéfinir :
    // la méthode définie dans la classe mère peut s’appliquer
    // de manière générique à toutes les instances des classes filles,
    // puisqu’elle agit sur les deux attributs hérités de la classe mère.
    @Override
    public String getInfo() {
        // On réutilise la méthode getInfo() de la superclasse
        // en utilisant le mot-clé super
        return super.getInfo() + ", " + nbPortes + " portes";
    }
}
