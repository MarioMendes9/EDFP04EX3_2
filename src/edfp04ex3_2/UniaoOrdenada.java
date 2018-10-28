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
public class UniaoOrdenada<T extends QueueADT>{
    private QueueADT<T> ordenada;
    private QueueADT<T> a1;
    private QueueADT<T> a2;

    public UniaoOrdenada(QueueADT<T> a1, QueueADT<T> a2) {
        this.ordenada = new LinkedQueue<>();
        this.a1 = a1;
        this.a2 = a2;
    }

  
    
    public void une(){
        
       while(!a1.isEmpty() || !a2.isEmpty()){
           T n2;
           T n1;
           

           
           if(!a2.isEmpty() && !a1.isEmpty()){
                n1=a1.dequeue();
                n2=a2.dequeue();
            if(n2<n1){
               
               
               this.ordenada.enqueue(n2);
               this.ordenada.enqueue(n1);
               
           }
           else{
               this.ordenada.enqueue(n1);
               this.ordenada.enqueue(n2);
           }}
           else{
               if(!a1.isEmpty() && a2.isEmpty()){
                n1=a1.dequeue();
               this.ordenada.enqueue(n1);
           }
               else{
                   n2=a2.dequeue();
                   this.ordenada.enqueue(n2);
               }
           }
       } 
    }

    public QueueADT<T> getOrdenada() {
        return ordenada;
    }

    @Override
    public int compareTo(T o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
