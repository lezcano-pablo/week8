/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmanagement;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
/**
 *
 * @author FamiliaLezcano
 */
public class CollectionManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ARRAY LIST \n");
        List myList = new ArrayList();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("4"); //ArrayList allows repeated elements and has an order
        System.out.println("This is my List and as you can see \nit allows repeated elements and has an order");
        print(myList);
        System.out.println("********************************************");
        
        System.out.println("SET \n");
        Set mySet= new HashSet();
        mySet.add("100");
        mySet.add("200");
        mySet.add("300");
        mySet.add("400");
        mySet.add("400");// Set does´t allow repeated elements, this line is ignored
        System.out.println("This is my Set and as you can see \nit doesn´t allow repeated elements and doesn´t have an order");
        print(mySet);
        System.out.println("********************************************");
        
        System.out.println("MAP \n");
        Map myMap= new HashMap();//Map uses keys and values
        myMap.put("1", "Juan");
        myMap.put("2", "Pablo");
        myMap.put("3", "Delfina");
        myMap.put("4", "Soledad"); 
        System.out.println("These are the keys of my map:");
        print(myMap.keySet()); //se imprimen los keys
        System.out.println("These are the values of my map: ");
        print(myMap.values()); //se imprimen los values
        System.out.println("This type of collection uses keys and values");
        System.out.println("********************************************");
        
        System.out.println("QUEUE \n");
        Queue<Integer> q1= new ArrayBlockingQueue<Integer>(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        System.out.println("Head of Queue is : " + q1.element());
        
        for(Integer value: q1){
            System.out.println("Queue value: " + value);
        }
        
        System.out.println("Removed from Queue: " + q1.remove());
        System.out.println("The first element to in was the \n first element to out");
        System.out.println("********************************************");

        
        System.out.println("TREE \n");
        TreeSet t= new TreeSet();
        t.add("A");
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("b");
        System.out.println("This is my Tree and as you can see \nit doesn´t allow repeated elements and follows a natural order \n"
                + "on this example the second element is duplicated, so is ignored");
        print(t);
    }
    
    private static void print(Collection collection){
        for (Object elemento : collection){
            System.out.println(elemento + "");
        }
        System.out.println("");
    }
    
}
