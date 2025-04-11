package Practice.Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        //check if given number is positive, negative or zero
//        var value = inputs.nextInt();
//        if (value > 0) {
//            System.out.println("Positive Number");
//        } else if (value < 0) {
//            System.out.println("Negative Number");
//        } else {
//            System.out.println("Zero Number");
//        }
        // END
        //takes a number (1-7) as input and prints the corresponding day of the week.
//        switch (inputs.nextInt()) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
        //END
        //Largest number of the 2 numbers
//        int num1=inputs.nextInt();
//        int num2=inputs.nextInt();
//
//        System.out.println((num1>num2)?num1+" is greater":num2+" is greater");
        //END
        int sum = 0;
        int i = 0;
        while (i <= 50) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
