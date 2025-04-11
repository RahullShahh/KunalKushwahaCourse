package Practice;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionsAndMethods {
    public static void main(String[] args) {
        int a, b;
        Scanner inputs = new Scanner(System.in);
//        System.out.println("Enter 2 integer numbers : ");
//        a=inputs.nextInt();
//        b=inputs.nextInt();
//
//        //SWAPPING 2 NUMBERS WITHOUT TEMP VARIABLE
//        SwapTwoNumbers(a,b);
//        System.out.println("Enter a number to check if it is prime or not.");
//        int inputnumber = inputs.nextInt();
//        boolean resultValue= isNumberPrime(inputnumber);
//        System.out.println((resultValue==true)?"Entered value is a prime number":"Entered value is not a prime number");
//            FUNCTION TO ADD 2 NUMBERS
//        FunctionsAndMethods functions=new FunctionsAndMethods() ;
//        functions.TwoNumbersSum(a,b);
        for (int i = 100; i < 1000; i++) {
            if(PrintAll3DigitArmstrongNumbers(i)){
                System.out.println(i);
            }
        }
    }

    public void TwoNumbersSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }

    public static void SwapTwoNumbers(int a, int b) {
        System.out.println("BEFORE SWAPPING: A=" + a + " and B=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("BEFORE SWAPPING: A=" + a + " and B=" + b);
    }

    public static boolean isNumberPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static boolean PrintAll3DigitArmstrongNumbers(int i) {
        int num = i;
        int sumNum = 0;
        while (i != 0) {
            int digit = (i % 10);
            sumNum += Math.pow(digit, 3);
            i = i / 10;
        }
        return (sumNum == num);
    }
}
