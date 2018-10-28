/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex3_2;

/**
 *
 * @author User
 * @param <T>
 */
public class LinkedQueue<T> implements QueueADT<T>{

    private LinearNode<T> front;
    private int size;
    private LinearNode<T> rear;

    public LinkedQueue() {
        this.front = null;
        this.size = 0;
        this.rear = null;
    }
    
    
    
    
    
    
    @Override
    public void enqueue(T element) {
        LinearNode<T> NewNode=new LinearNode<>(element);
        if(isEmpty()){
                this.front=NewNode;
                this.rear=NewNode;
               
                       
            }
        else{
            this.rear.setNext(NewNode);
            this.rear=NewNode;
            
        }
        size++;
    }

    @Override
    public T dequeue() {
        T valor;
        if(isEmpty())
            return null;
        else{
        valor=this.front.getElement();
        this.front=this.front.getNext();
        size--;
        }
        
        return valor;
    }

    @Override
    public T first() {
       return this.front.getElement();
    }

    @Override
    public boolean isEmpty() {
      return (size==0);
    }

    @Override
    public int size() {
       return this.size;
    }

    @Override
    public String toString() {
       String s="Stack:";
       LinearNode<T> c=this.front;
       for(int i=0;i<size;i++){
           s+=c.getElement()+" ";
           c=c.getNext();
                   
       }
       
       return s;
    }
    
    
}
