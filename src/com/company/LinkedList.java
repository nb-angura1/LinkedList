package com.company;

import java.sql.SQLOutput;

public class LinkedList {
    public Node head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int[] values) {
        head = new Node(values[0]);
        Node n = head;
        for (int i=1; i<values.length; i++) {
            Node adding = new Node(values[i]);
            n.setNext(adding);
            n = n.getNext();
        }
    }


    public void addItem(int v) {
        Node n = new Node(v);
        if (head == null) {
            head = n;
        } else {
            // walk the list to the end
            Node current = head;
            Node previous = null;
            while (current != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(n);
        }

    }
    public void addFirst(int v){
        Node current = head;
        Node newNode = new Node(v);
        newNode.setNext(current);
        head = newNode;
    }
    public void addIndexed(int index, int n){
        Node current = head;
        Node previous = null;
        int counter = 0;
        while(current!=null){

            if(counter == index){
                Node newValue = new Node(n);
                previous.setNext(newValue);
                newValue.setNext(current);
                break;
                }
            counter++;
            previous = current;
            current = current.getNext();
            }

    }public int getFirst(){
        Node value = head;
        return value.getValue();
    }
    public int getLast() {
        Node current = head;
        Node previous = null;
        do {
            previous = current;
            current = current.getNext();
        } while (current.getNext() != null);
        return current.getValue();
    }
    public int getIndexed(int index){
        Node current = head;
        Node previous = null;
        int counter = 0;
        do{
            previous = current;
            current = current.getNext();
            counter++;
        }while (counter != index-1);
        return current.getValue();

    }
    public void set(int index, int n){
        Node current = head;
        Node previous = null;
        int counter = 0;
        do{
            previous = current;
            current = current.getNext();
            counter++;
        }while (counter != index-1);
        current.setValue(n);
    }
    public void clear(){
        Node current = head;
        head.setNext(null);
        }

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public int size(){
        int counter = 0;
            // walk the list to the end
            Node current = head;
            Node previous = null;
            while (current != null) {
                previous = current;
                current = current.getNext();
                counter++;
                //increment counter for each time it goes through a node
            }

        return counter;
        }
        public boolean contains(int n){
            Node current = head;
            Node previous = null;
            while (current != null) {
                if(current.getValue() == n){
                    return true;
                }
                current = current.getNext();
            }
            return false;
        }
        public int indexOf(int n){
            Node current = head;
            Node previous = null;
            int counter = 0;
            while (current != null) {
                if(current.getValue() == n){
                    return counter+1;
                }
                current = current.getNext();
                counter++;
            }
            return -1;
        }
        }




