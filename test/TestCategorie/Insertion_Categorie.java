/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCategorie;
import alimentation.*;
import java.util.*;
/**
 *
 * @author jhy
 */
public class Insertion_Categorie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<EntityClasses> classes = new ArrayList<>();
        classes.add(new Categorie("Breuvages"));
        classes.add(new Categorie("Produits céréaliers"));
        classes.add(new Categorie("Produits laitiers et substituts"));
        classes.add(new Categorie("Poisson et fruit de mer"));
        classes.add(new Categorie("Fruits et légumes"));
        classes.add(new Categorie("Viande"));
        classes.add(new Categorie("Huiles, graisses et légumineuses"));
        classes.add(new Categorie("Pâtisseries et pâtes"));
        classes.add(new Categorie("La nourriture pour animaux"));
        classes.add(new Categorie("Plats cuisinés et produits végétariens"));
        classes.add(new Categorie("Soupes, sauces, marinades, assaisonnement et épices"));
        classes.add(new Categorie("Friandise"));
        classes.add(new Categorie("Noix, arachides, et grignotines"));
        
        classes.forEach((ec) -> {
            EntityClasses.add(ec);
            System.out.println("Added: " + ec);
        });
        
        
    }
    
}
