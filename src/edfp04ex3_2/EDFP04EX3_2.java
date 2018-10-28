/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex3_2;

/**
 *
 * @author User
 */
public class EDFP04EX3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //QueueADT<Integer> a1=new LinkedQueue<>();
        QueueADT<Integer> a1=new CircularArrayQueue<>();
        a1.enqueue(2);
        a1.enqueue(4);
        a1.enqueue(8);
        a1.enqueue(10);
        
        //QueueADT<Integer> a2=new LinkedQueue<>();
        QueueADT<Integer> a2=new CircularArrayQueue<>();
        a2.enqueue(1);
        a2.enqueue(4);
        a2.enqueue(9);
        a2.enqueue(12);
        a2.enqueue(15);
        
        UniaoOrdenada2 u=new UniaoOrdenada2(a1, a2);
        u.une();
        System.out.println(u.getOrdenada().toString());
        
    }
    
}
