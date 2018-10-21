package com.company;

public class Main {

    public static void main(String[] args) {

        Parsing parsing = new Parsing();
        LinkList polynomial = new LinkList();
        LinkList polynomial2 = new LinkList();
        LinkList polynomial3 = new LinkList();
        Addition addition = new Addition();
        Link link = new Link();


        String polynomial_string = "2x^2-3x+4+4x^6"; //
        String polynomial_string2 = "5x^2+4+3x^3"; //



        parsing.parsing_string(polynomial_string + " ", polynomial);
        parsing.parsing_string(polynomial_string2 + " ", polynomial2);

        Link current1 = polynomial.first;
        Link current2 = polynomial2.first;
        polynomial.displayList();
        polynomial2.displayList();
        addition.Addition(current1.getPower(), current1.getFactor(), current2.getPower(), current2.getFactor(), current1, current2, polynomial3);

        polynomial3.displayList();
    }
}

