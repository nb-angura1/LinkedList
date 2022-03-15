package com.company;

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        next = null;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int n){
        this.value = n;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getNext() {
        return next;
    }

    public void display() {
        System.out.println(value);
    }
}
