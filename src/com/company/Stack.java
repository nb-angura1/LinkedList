package com.company;
//LAST IN, FIRST OUT ----LIFO
public class Stack extends LinkedList{
    public Stack(){
        super();
    }
    public void push(int n) {//Adds a value to the top of the stack
        addFirst(n);
    }
    public boolean pop() {
     try{
         int value = head.getValue();
         head = head.getNext();
         return true;
     }catch(Exception e){
         return false;
     }
    }

    public int peek(){
        return head.getValue();
    }
    public boolean isEmpty(){
        return !pop();
    }
}
