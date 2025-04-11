package Practice;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner inputs=new Scanner(System.in);
//        System.out.println("Enter your roll no value.");
//        int rollno=inputs.nextInt();
//        System.out.println("ROLLNO: "+rollno);
//
//        System.out.println("Enter your name.");
//        String name=inputs.nextLine();
//        System.out.println("NAME:"+name);
        System.out.println("Enter 2 values a & b and get the calculated sum as the answer");
        int sum= inputs.nextInt()+inputs.nextInt();
        System.out.println("SUM is : "+sum);
    }
}
