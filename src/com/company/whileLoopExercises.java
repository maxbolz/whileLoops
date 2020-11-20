package com.company;

public class whileLoopExercises {

    public static int addOdds(int n) {

        int sum = 0;
        int count = 1;

        while (count <= n) {

            sum += count;
            count += 2;
        }

        return(sum);

    }

    public static int howManyYears(double startPop, double endPop)
    {

        int numYears = 0;

        while (startPop <= endPop)
        {
            startPop *= 1.0113;
            numYears++;
        }

        return numYears;

    }

    public static void printSum(int n)
    {
        int sum = 1;
        int count = 1;

        System.out.print(count);          //prints 1 and sets counting to 2 so that there is no + before first integer.
        count++;

        while (count <= n) {
            sum += count;
            System.out.print(" + " + count);
            count++;
        }

        System.out.print(" = " + sum + "\n");

    }

    public static boolean isPerfectSquare(int n)
    {
        int count = 1;

        while (true)
        {
            n -= count;
            count += 2;

            if (n == 0) return true;
            if (n < 0) return false;

        }
    }

    public static int sumDigits(int n)
    {
        int sum = 0;

        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }

        return (sum);

    }

    public static void main (String[] args){

        System.out.println("\nAdd Odds:");
        System.out.println("Sum of Odd Integers from 1 to 3: " + addOdds(3));
        System.out.println("Sum of Odd Integers from 1 to 5: " + addOdds(5));
        System.out.println("Sum of Odd Integers from 1 to 6: " + addOdds(6));

        System.out.println("\nHow Many Years:");
        System.out.println("How Many Years for 120m to 150m: " + howManyYears(120,150));
        System.out.println("How Many Years for 270m to 500m: " + howManyYears(270,500));
        System.out.println("How Many Years for 300m to 301m: " + howManyYears(300,301));

        System.out.println("\nPrint Sum:");
        printSum(6);
        printSum(8);
        printSum(13);

        System.out.println("\nIs Perfect Square:");
        System.out.println("Is 16 a perfect square: " + isPerfectSquare(16));
        System.out.println("Is 25 a perfect square: " + isPerfectSquare(25));
        System.out.println("Is 6 a perfect square: " + isPerfectSquare(6));
        System.out.println("Is 7 a perfect square: " + isPerfectSquare(7));

        System.out.println("\nSum Digits:");
        System.out.println("Sum of All Digits of 4: " + (sumDigits(4)));
        System.out.println("Sum of All Digits of 52: " + (sumDigits(52)));
        System.out.println("Sum of All Digits of 632: " + (sumDigits(632)));

        }
    }


