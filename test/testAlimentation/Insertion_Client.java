/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testAlimentation;

/**
 *
 * @author jhy
 */
import java.util.List;
import java.util.ArrayList;
import alimentation.EntityClasses;
import alimentation.Client;
public class Insertion_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        @Test
        insertion of elements into the database
        */
        List<EntityClasses> classes = new ArrayList<>();
        classes.add(new Client("default"));
        classes.add(new Client("Otang Glen Orock","(+237)683070582","Ecole Nationale Superieure Polytechnique Yaounde"));
        classes.add(new Client("Manengono Guy Mario","(+237)693168175","Ecole Nationale Superieure Polytechnique Yaounde"));
        classes.add(new Client("Matip Gwet Marcele Simeon","(+237)656201331","Ecole Nationale Superieure Polytechnique Yaounde"));
        classes.add(new Client("Madjio Tsoza Cyrielle Ornella","(+237)696736423","Ecole Nationale Superieure Polytechnique Yaounde"));
        classes.add(new Client("Ndjebayi Damaris Stephanie","(+237)693476812","Ecole Nationale Superieure Polytechnique Yaounde"));
        
        classes.forEach((ec)->{
            try{
                EntityClasses.add(ec);
                System.out.println("Added: " + ec);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        });
        /*
        @Test
        deleting elements from the database
        try{
            Client client = (Client) EntityClasses.get(Client.class,1);
            EntityClasses.remove(client);
        }catch(Exception e){
            System.out.println("*****************************");
            System.out.println(e.getMessage());
            System.out.println("*****************************");
            
        }
        */
    }
    
}
