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
public class UniaoOrdenada2{
    private QueueADT<Integer> ordenada;
    private QueueADT<Integer> a1;
    private QueueADT<Integer> a2;

//    public UniaoOrdenada2(QueueADT<Integer> a1, QueueADT<Integer> a2) {
//        this.ordenada = new LinkedQueue<>();
//        this.a1 = a1;
//        this.a2 = a2;
//    }

    public UniaoOrdenada2(QueueADT<Integer> a1, QueueADT<Integer> a2) {
        this.ordenada = new CircularArrayQueue<>();
        this.a1 = a1;
        this.a2 = a2;
    }

    

    
    public void une(){
        while(!a1.isEmpty() && !a2.isEmpty()){
            int n;
            if(a1.first()<a2.first()){
                n=a1.dequeue();
            }
            else{
                n=a2.dequeue();
                
            }
            this.ordenada.enqueue(n);
        }
       while(!a1.isEmpty()){
           this.ordenada.enqueue(a1.dequeue());
       }
       while(!a2.isEmpty()){
           this.ordenada.enqueue(a2.dequeue());
       }
    }

    public QueueADT<Integer> getOrdenada() {
        return ordenada;
    }

   
   
    
    
}
