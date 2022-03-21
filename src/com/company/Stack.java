package com.company;

public class Stack extends LinkedList{
    static final int max = 1000;
    int top;
    int a[] = new int[max];
    public Stack(){
        super();
        top = 0;
    }
    public void push(int n) {//Adds a value to the top of the stack
        addItem(n);
        top++;
    }
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow - there isn't anything in the stack");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    public int peek(){
        return 0;
    }
    public boolean isEmpty(){
        return false;
    }

}
