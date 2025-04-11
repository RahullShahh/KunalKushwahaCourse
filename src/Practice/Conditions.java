package Practice;
import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
//        NORMAL IF/ELSE CONDITION
//        Scanner inputs =new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int a=inputs.nextInt();
//        if(a<10){
//            System.out.println("Value of a is less than 10.");
//        }
//        else{
//            System.out.println("Value of a is greater than 10.");
//        }

//        FIND THE LARGEST NUMBER
//        Scanner inputs=new Scanner(System.in);
//        int inputA=inputs.nextInt();
//        int inputB=inputs.nextInt();
//        int inputC=inputs.nextInt();
//
//        int maxValue=inputA;
//        if(inputB>maxValue){
//            maxValue=inputB;
//        }
//        if(inputC>maxValue){
//            maxValue=inputC;
//        }
//        System.out.println(maxValue +" is the greatest.98");

//      FIBONACCI SERIES
//        int num1=0;
//        int num2=1;
//        System.out.print(num1+",");
//        for(int i=0;i<8;i++){
//            int nextNum=num1+num2;
//            System.out.print(nextNum+",");
//            num1=num2;
//            num2=nextNum;
//        if(i==7){
//            System.out.println(nextNum);
//        }
//        }

//      COUNT THE OCCURRENCE OF DIGITS
//        Scanner inputs =new Scanner(System.in);
//        int stringInput=inputs.nextInt();
//        int searchChar=inputs.nextInt();
//        int occurrenceCount=0;
//        while (stringInput>0){
//            if(stringInput%10==searchChar){
//                occurrenceCount+=1;
//            }
//            stringInput=  stringInput/10;
//        }
////        for(int i=0;i< ;i++){
////            if(stringInput.charAt(i)==searchChar){
////                occurrenceCount+=1;
////            }
////        }
//        System.out.println("No. of times "+searchChar+" occured is "+occurrenceCount);

        //SWITCH CASES
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER A FRUIT OF YOUR CHOICE: ");
        String inputValue=input.nextLine();
        switch (inputValue) {
            case "apple" -> System.out.println("It is an apple");
            case "grapes" -> System.out.println("It is an grapes");
            case "oranges" -> System.out.println("It is an oranges");
            case "kiwis" -> System.out.println("It is an kiwis");
            default -> System.out.println("Cannot detect this fruit");
        }
    }
}
