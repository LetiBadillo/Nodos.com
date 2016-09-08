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
public class linealListClass {
    nodeClass first;
    nodeClass last;
    //Mètodos
    
    public void insertFirst(int n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            node.next=first;
            first=node;
        }
    }
    
    public boolean isEmpty(){
        return first==null;
    }
    public void showList(){
        if(!isEmpty()){
           nodeClass aux;
           aux=first;
           while (aux!= null){
               System.out.println(aux.data);
               aux= aux.next;
               
           }
            
        }else{
            System.out.println("La lista está vacía.");
        }
    }
}
