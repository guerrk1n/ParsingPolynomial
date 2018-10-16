package com.company;

import com.sun.deploy.util.StringUtils;

public class Main {

    public static void main(String[] args) {


        LinkList polynomial = new LinkList();
        LinkList polynomial2 = new LinkList();
        LinkList polynomial3 = new LinkList();

        String polynomial_string = "2x^2-3x+4";

        for (int i = 0; i < polynomial_string.length(); i++) {

            if (polynomial_string.charAt(i) == 'x' && polynomial_string.charAt(i + 1) == '^') { // X в N-ой степени

                if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                    polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i - 1)), polynomial_string.charAt(i + 2));

                } else {
                    polynomial.insertFirst(polynomial_string.charAt(i - 1), polynomial_string.charAt(i + 2));
                }

            } else if (polynomial_string.charAt(i) == 'x' && polynomial_string.charAt(i + 1) != '^') { // X в первой степени

                if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                    polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i - 1)), 1);

                } else {
                    polynomial.insertFirst(polynomial_string.charAt(i - 1), 1);
                }
            }

            if (polynomial.isDigit(polynomial_string.charAt(i)) && polynomial_string.charAt(i + 1) != 'x' && i<polynomial_string.length()) { // свободный член

                if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                    polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i)), 0);
                } else {
                    polynomial.insertFirst(polynomial_string.charAt(i), 0);
                }
            }





        }


    }


}

