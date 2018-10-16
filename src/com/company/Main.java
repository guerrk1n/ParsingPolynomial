package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        LinkList polynomial = new LinkList();
        Scanner scanner = new Scanner(System.in);

        String polynomial_string = "2x^2-3x+4+4x^6";
        //polynomial_string = scanner.next();

        try {
            for (int i = 0; i < polynomial_string.length(); i++) {

                if (polynomial_string.charAt(i) == 'x' && polynomial_string.charAt(i + 1) == '^') { // X в N-ой степени

                    if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                        polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i - 1)), Character.getNumericValue(polynomial_string.charAt(i + 2)));

                    } else {
                        polynomial.insertFirst(Character.getNumericValue(polynomial_string.charAt(i - 1)), Character.getNumericValue(polynomial_string.charAt(i + 2)));
                    }

                } else if (polynomial_string.charAt(i) == 'x' && polynomial_string.charAt(i + 1) != '^') { // X в первой степени

                    if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                        polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i - 1)), 1);

                    } else {
                        polynomial.insertFirst(Character.getNumericValue(polynomial_string.charAt(i - 1)), 1);
                    }
                } else if (polynomial.isDigit(polynomial_string.charAt(i)) && polynomial_string.charAt(i + 1) != 'x' && polynomial_string.charAt(i - 1) != '^') { // свободный член

                    if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                        polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i)), 0);
                    } else {
                        polynomial.insertFirst(Character.getNumericValue(polynomial_string.charAt(i)), 0);
                    }
                }


            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        polynomial.displayList();
        String s = "fgaskhdfkas+56412+gasg782+asf3";
        String numbers = s.replaceAll("[^0-9]", "");
        System.out.println(numbers);

    }


}

