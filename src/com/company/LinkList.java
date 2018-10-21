package com.company;


public class LinkList {

    public Link first;

    public boolean isDigit(char c) {

        return Character.isDigit(c);
    }

    public void insertFirst(int factor, int power) {

        Link newlink = new Link(factor, power);
        newlink.next = first;
        first = newlink;

    }


    public String isNumber(int i, String number){

        String number_full = "";
        for(int j=i; j<number.length(); j++){

            if(isDigit(number.charAt(j))){

                number_full+=number.charAt(j);
            }

        }

        return number_full;
    }


    public void displayList() {
        System.out.println("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
        System.out.println();
    }
}
