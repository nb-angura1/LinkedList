package com.company;

class Main {
    public static void main(String[] args) {
        System.out.println("Linked list demo!");
        // create some nodes
        Node n1 = new Node(13);
        Node n2 = new Node(7);
        Node n3 = new Node(68);
        n1.setNext(n2);
        n2.setNext(n3);
        n1.display();
        n2.display();
        n3.display();

        // create a linked list
        int[] data = {1,1,2,4,7,6,7,8,4,8};
        LinkedList myList = new LinkedList(data);
        System.out.println("Original list");
        myList.display();
        System.out.println("New list");
        myList.addItem(72);
        myList.addFirst(423);
        myList.addIndexed(2,200);
        myList.clear();
        myList.display();
        System.out.println("The list size is " + myList.size());
    /*myList.head.display();
    myList.head.getNext().display();
    myList.head.getNext().getNext().display();
    myList.head.getNext().getNext().getNext().display();
    myList.head.getNext().getNext().getNext().getNext().display(); */
    }
}

