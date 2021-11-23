package net.cofares.dependences_forte;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import lombok.Getter;
import lombok.Setter;

/**
 * Une classe qui fait des choses! 
 * Juste pour montrer les dépendences forte
 * 
 * Mais même elle est commentée
 * 
 * Elle possède une méthde nommon la traitement
 * @author Pascal Fares
 */
public class B {
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String commentaire;
    
    /**
     * Contructeur par défaut
     */
    public B() {
        id=0;
        commentaire="Initialisation sans informations!";
    }
    
    public B(int idimporte) {
        id= idimporte;
        commentaire="Constructeur avec paramètre...";
    }
    /**
     * Traitement : un hash super simple
     * 
     * Peu importe ce que cela fait, l'objectif est de 
     * demontrer le couplage fort
     * 
     * @param x : reducteur de l'id
     * @return l'identifiant modulo x
     */
    public int traitement(int x) throws IOException {
        try (FileWriter fw = new FileWriter("a.txt")) {
            fw.write("Welcome to javaTpoint.");
        }    
        return getId()%x;
    }
}
