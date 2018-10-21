package com.company;


public class Addition {

    public void Addition(int power1, int factor1, int power2, int factor2, Link current1, Link current2, LinkList polynomial3) {

        int sum_factor = 0;


        while (current2 != null) {

            while (current1 != null) {
                if (power1 == power2) {

                    sum_factor = factor1 + factor2;
                    polynomial3.insertFirst(sum_factor, power1);


                } else {

                    polynomial3.insertFirst(factor2, power2);

                }

                current1 = current1.next;


            }
            current2 = current2.next;
        }
    }
}
