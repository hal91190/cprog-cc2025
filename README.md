# CC compléments de programmation

* **Question 1**: Écrire en Java la classe `Voiture` qui possède un attribut nombre de portes et qui `démarre()` en affichant un `"Vroom"`.

    cf. [Voiture.java](src/main/java/fr/uvsq/cprog/Voiture.java)

* **Question 2**: Écrire en Java la classe `Moto` qui peut instancier des motos de type "sideCar" ou "Moto solo" (*boolean*). Une moto quand elle `démarre()` fait `"Broom"`.

    cf. [Moto.java](src/main/java/fr/uvsq/cprog/Moto.java)

* **Question 3**: Parmi les affirmations suivantes, laquelle est correcte ?
  * Le polymorphisme permet d’appeler `demarrer()` sur un objet de type `Vehicule` même si sa classe réelle est `Voiture`.
    * OUI l'héritage et le polymorphisme permettent d'invoquer la méthode `demarrer()` sur une instance de `Voiture` manipulée par une référence sur `Vehicule`
  * Une méthode `abstract` peut avoir un corps d’implémentation dans la classe parente.
    * NON c'est justement la signification de `abstract` qui marque une méthode qu'on ne peut pas implémenter à ce niveau de généralisation
  * La méthode `getInfo()` ne peut pas être appelée sur un objet de type `Moto` car elle n’est pas redéfinie.
    * NON il est possible d'invoquer `getInfo()` à partir de toutes les sous-classes de `Vehicule`
  * En Java, le polymorphisme ne fonctionne qu’avec les *interfaces*, pas avec les classes *abstraites*.
    * NON le polymorphisme est mis en œuvre de façon équivalente sur ces deux structures qui sont d'ailleurs deux concepts proches

* **Question 4**: Écrire une classe Java `Garage`, juste avec une méthode polymorphique `faireDemarrer(Vehicule v)` qui retourne une `String` qui est le résultat de `v.demarrer()` et `v.typeVehicule()`. Pas besoin d’écrire un constructeur.

    cf. [Garage.java](src/main/java/fr/uvsq/cprog/Garage.java)

* **Question 5**: Écrire un test JUnit 4 (ou 5) pour vérifier qu’une `Moto("Yamaha", 2018, false)` affiche bien "Broom! La moto Yamaha démarre." et "Moto solo".

    cf. [VehiculeTest.java](src/test/java/fr/uvsq/cprog/VehiculeTest.java)

* **Question 6**: Expliquez brièvement pourquoi le code suivant compile mais ne produit pas le résultat attendu ?

    Vehicule v = new Voiture("Renault", 2015 , 3);
    System.out.println(v.typeVehicule()); // Affiche "Véhicule générique" au lieu de " Voiture (3 portes )"

  * Le code compile car le mécanisme d'héritage permet d'affecter une référence sur une instance d'une sous-classe à une variable du type de la super-classe et rend disponible les méthodes de la super-classe.
  * Cependant, la méthode `typeVehicule()` n'est pas redéfinie dans la classe `Voiture`, donc l'appel de cette méthode utilise la version héritée de `Vehicule`, qui retourne la chaîne générique "Véhicule générique".
  * Pour obtenir le résultat attendu, il faudrait redéfinir la méthode `typeVehicule()` dans la classe `Voiture` pour qu'elle retourne une description spécifique de la voiture, incluant le nombre de portes.
  * Le développeur a pu recopier la méthode de la classe mère et ne l'a pas encore modifiée !
  * La cause ne peut être du à `@Override` qui est une annotation facultative mais recommandée. Son absence n'empêche pas le polymorphisme.
* **Question 7**: Quel énoncé concernant Maven est correct ?
  * Maven utilise par défaut le fichier pom.json pour définir les dépendances et la configuration du projet.
    * NON Maven utilise le fichier pom.xml (au format XML et non pas JSON)
  * La commande `mvn clean install` supprime le répertoire `target`, compile le code, exécute les tests, puis installe l’artefact dans le dépôt local.
    * OUI la commande exécute d'abord le cycle de vie `clean` qui supprime le répertoire `target`, puis le cycle de vie par défaut jusqu'à la phase `install` qui compile, teste et installe l'artefact dans le dépôt local.
  * Les dépendances transitives sont automatiquement résolues par Maven, mais il faut les déclarer manuellement dans le `pom.xml`.
    * NON les dépendances transitives sont automatiquement résolues par Maven sans qu'il soit nécessaire de les déclarer explicitement dans le `pom.xml`.
  * Le cycle de vie Maven comprend les phases `validate`, `compile`, `test`, `package`, `verify`, `install` et `deploy`, dans cet ordre strict.
    * OUI c'est l'ordre correct des phases du cycle de vie par défaut de Maven.

* **Question 8**: Parmi les affirmations suivantes sur les types et classes en Java, lesquelles sont correctes ?
  * Un type primitif comme `int` peut être assigné directement à un objet de type `Integer` sans conversion explicite (*autoboxing*).
    * OUI le mécanisme d'autoboxing permet cette conversion implicite entre types primitifs et leurs classes enveloppes.
  * La classe `String` est immutable, ce qui signifie qu’une fois créée, son contenu ne peut pas être modifié.
    * OUI les instances de `String` ne peuvent pas être modifiées après leur création ; toute opération qui semble modifier une chaîne crée en réalité une nouvelle instance.
  * En Java, les tableaux sont des objets et héritent donc de la classe `Object`.
    * OUI les tableaux en Java sont des objets et héritent de la classe `Object` (cf. [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se25/html/jls-10.html#jls-10.7))
  * Le mot-clé `static` permet de déclarer une variable ou méthode appartenant à une instance spécifique d’une classe.
    * NON le mot-clé `static` indique que la variable ou méthode appartient à la classe elle-même, et non à une instance spécifique de cette classe.

* **Question 9**: Parmi les affirmations suivantes sur `git`, lesquelles sont correctes ?
  * La commande `git commit -m "message"` enregistre les modifications uniquement dans le dépôt local, pas sur le dépôt distant.
    * OUI les commandes de gestion de versions de `git` ne nécessitent pas de connexion à un dépôt distant puisqu'un tel dépôt existe localement. Certaines commandes comme `git push` permettent d'échanger des branches avec un dépôt distant.
  * `git pull` est équivalent à `git fetch` suivi de `git merge`, mais sans risque de conflit si le dépôt distant n’a pas changé.
    * OUI `git pull` combine les opérations de `git fetch` (récupération des modifications du dépôt distant) et `git merge` (fusion de ces modifications dans la branche courante). Cependant, il peut y avoir des conflits si le dépôt distant a changé.
  * La commande `git checkout -b nouvelle-branche` crée une nouvelle branche et bascule dessus, mais ne pousse pas automatiquement vers le dépôt distant.
    * OUI cette commande crée une nouvelle branche locale et bascule dessus, mais il faut utiliser `git push -u origin nouvelle-branche` pour la pousser vers le dépôt distant.
  * Pour supprimer définitivement les modifications non commitées dans le répertoire de travail, on utilise `git restore .` ou `git checkout -- .`.
    * OUI ces commandes permettent de restaurer les fichiers du répertoire de travail à leur état dans le dernier commit, supprimant ainsi les modifications non commitées.

* **Question 10**: Parmi les affirmations suivantes sur les relations entre classes en Java, lesquelles sont correctes ?
  * L'héritage permet à une classe d'hériter des attributs et méthodes d'un autre classe, et Java autorise l'héritage multiple direct entre classes.
    * NON Java n'autorise pas l'héritage multiple de classes (une classe ne peut hériter que d'une seule super-classe), mais permet l'implémentation de multiples interfaces.
  * L'association est une relation structurelle où une classe contient une référence à une autre classe, mais les deux classes peuvent exister indépendamment.
    * OUI une association se traduit structurellement par une référence à une autre classe sans que le cycle de vie des instances soit strictement lié.
  * L'agrégation est une forme d'association où une classe "possède" une autre classe, et la destruction de la classe conteneur entraîne la destruction des objets contenus.
    * NON l'agrégation implique une relation "partie-tout" où les parties peuvent exister indépendamment du tout. La destruction de la classe conteneur n'entraîne pas nécessairement la destruction des objets contenus.
  * La composition est une relation forte où les objets contenus ne peuvent pas exister sans la classe conteneur.
    * OUI dans une relation de composition, les objets contenus sont fortement liés à l'objet conteneur et ne peuvent pas exister indépendamment de celui-ci.
