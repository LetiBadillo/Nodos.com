/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author ASUS
 */
public class Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       linealListClass list = new linealListClass();
       list.insertFirst(10);
       list.insertFirst(20);
       list.showList();
       
    }
    
}
