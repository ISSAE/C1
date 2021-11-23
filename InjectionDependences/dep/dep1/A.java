package dep1;

/**
 * Décrivez votre classe A ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class A {
    private B b;

    /**
     * Constructeur d'objets de classe A
     */
    public A() {
        b = new B();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param y le paramètre de la méthode
     * @return 10 fois le résultat de b.sampleMethod(y)
     * 
     * @see B
     */
    public int sampleMethod(int y) {
        // Un traitement ... Qui utilise une méthode de b
        return b.sampleMethod(y) * 10;
    }
}
