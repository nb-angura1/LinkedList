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
        int[] data = {156,1,2,4,7,6,7,8,4,64};
        LinkedList myList = new LinkedList(data);
        System.out.println("Original list");
        myList.set(3,69);
        myList.display();
        int lastNum = myList.getLast();
        System.out.println("the last number is " + lastNum);
        int number = myList.getIndexed(4);
        System.out.println("Indexed number is " + number);
        boolean contains = myList.contains(2);
        System.out.println("True or false=" + contains);
        int indexOf = myList.indexOf(69);
        System.out.println("Index of number is " + indexOf);

        System.out.println("..............................................");
        Stack s = new Stack();
        s.push(3);
        s.push(34);
        s.push(89);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println("...............................................");
        Queue q = new Queue();
        q.enqueue(9);
        q.enqueue(7);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.size());
        /*System.out.println("New list");


        myList.addItem(72);
        myList.addFirst(423);
        myList.addIndexed(2,200);
        myList.clear();
        myList.display();
        System.out.println("The list size is " + myList.size());*/
    }
}

