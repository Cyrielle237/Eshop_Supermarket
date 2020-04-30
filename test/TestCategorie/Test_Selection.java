/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCategorie;
import alimentation.Categorie;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author jhy
 */
public class Test_Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Categorie> categories = Categorie.getCategories();
        List<String> categoriesNames = new ArrayList<>();
        categories.forEach((cat) -> {
            categoriesNames.add(cat.getNomCat());
        });
        List<String> categoriesNames2 = Categorie.getCategoriesNames() ;
        System.out.println(Categorie.getCategorieIdByName(categoriesNames.get(0)));
        System.out.println(Categorie.getCategorieByName(categoriesNames.get(0)));
        
    }
    
}
