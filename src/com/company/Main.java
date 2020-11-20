package com.company;

public class Main {

    public static int addOdds(int n) {
        int count = 1;

        while (count < n) {
            count = count + 2;
            System.out.println(count);
        }
        return count;
    }

    public static void main (String[] args){

        System.out.println(addOdds(17));

    }
}
