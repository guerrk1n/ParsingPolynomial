package com.company;


public class Parsing {

    public void parsing_string(String polynomial_string, LinkList polynomial) {

        try {
            for (int i = 0; i < polynomial_string.length(); i++) {

                if (polynomial_string.charAt(i) == 'x' && polynomial_string.charAt(i + 1) == '^') {// X в N-ой степени

                    if (polynomial_string.charAt(i) == ' ') {
                    } else {

                        if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                           // polynomial.isNumber(i-1,polynomial_string.substring(i-1, polynomial_string.length()) );


                           polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i - 1)), Character.getNumericValue(polynomial_string.charAt(i + 2)));

                        } else {
                            polynomial.insertFirst(Character.getNumericValue(polynomial_string.charAt(i - 1)), Character.getNumericValue(polynomial_string.charAt(i + 2)));
                        }
                    }

                } else if (polynomial_string.charAt(i) == 'x' && polynomial_string.charAt(i + 1) != '^' && polynomial_string.charAt(i) != ' ') { // X в первой степени

                    if (polynomial_string.charAt(i) == ' ') {
                    } else {
                        if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                            polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i - 1)), 1);

                        } else {
                            polynomial.insertFirst(Character.getNumericValue(polynomial_string.charAt(i - 1)), 1);
                        }
                    }

                    // нахождение свободного члена
                } else if (polynomial.isDigit(polynomial_string.charAt(i)) && polynomial_string.charAt(i + 1) != 'x' && polynomial_string.charAt(i - 1) != '^' && polynomial_string.charAt(i) != ' ') {

                    if (polynomial_string.charAt(i) == ' ') {
                    } else {
                        if (i >= 2 && polynomial_string.charAt(i - 2) == '-') {

                            polynomial.insertFirst(-Character.getNumericValue(polynomial_string.charAt(i)), 0);
                        } else {
                            polynomial.insertFirst(Character.getNumericValue(polynomial_string.charAt(i)), 0);
                        }
                    }
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

    }
}
