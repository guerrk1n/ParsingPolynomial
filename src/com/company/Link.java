package com.company;


public class Link {

    public int factor;
    public int power;
    public Link next;

    public Link(int factor, int power) {

        this.power = power;
        this.factor = factor;

    }

    public Link() {
    }

    public int getFactor() {
        return factor;
    }

    public int getPower() {

        return power;
    }

    public void displayLink() {

        System.out.println("{" + factor + " , " + power + " }");
    }
}
