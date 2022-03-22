package com.company;
//FIRST IN, FIRST OUT-------- FIFO
public class Queue extends LinkedList{
    public Queue(){
        super();
    }
    public void enqueue(int n){
        addItem(n);
    }
    public int dequeue(){
        try{
            int value = head.getValue();
            head = head.getNext();
            return value;
        }catch(Exception e){
            return -1;
        }
    }
    public boolean isEmpty(){
        if(dequeue()==-1){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        Node current = head;
        Node previous = null;
        int counter = 0;
        while (current != null) {
            previous = current;
            current = current.getNext();
            counter++;
            //increment counter for each time it goes through a node
        }
        return counter;
    }
}
