/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGestionaire;
import alimentation.EntityClasses;
import alimentation.Gestionnaire;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author jhy
 */
public class TestInsertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Gestionnaire> list = new ArrayList<>();
        list.add(new Gestionnaire("Otang Glen Orock","orockglen","orockglen",true));
        list.add(new Gestionnaire("boss","boss","boss",true));
        list.add(new Gestionnaire("default","default","default"));
        
        Iterator it = list.iterator();
        while(it.hasNext()){
            EntityClasses.add((EntityClasses)it.next());
        }
         
    }
    
}
