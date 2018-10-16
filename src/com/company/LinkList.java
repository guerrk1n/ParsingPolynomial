package com.company;


public class LinkList {

    public Link first;

    public boolean isEmpty() {

        return (first == null);
    }

    public boolean isDigit(char c){

        return Character.isDigit(c);
    }

    public void insertFirst(int factor, int power) {

        Link newlink = new Link(factor, power);
        newlink.next = first;
        first = newlink;

    }

    public Link deleteFirst() {

        Link temp = first;
        first = first.next;
        return temp;

    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
        System.out.println();
    }

}
