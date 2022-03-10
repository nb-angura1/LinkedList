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
        Node newNode = new Node(v);
        head = newNode;

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
            }

        return counter;
        }

    }


