package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
//        list.add(23);
//        list.add(543);
//        list.add(52);
//        list.add(12);
//        list.add(78);
//        list.add(12);
//        System.out.println(list);
//
        Scanner inputs = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            list.add(inputs.nextInt());
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i) + " ");
//        }

        int[] arrays = new int[5];
        System.out.println("Enter 5 integers in the array");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i]=inputs.nextInt();
        }
        int max=arrays[0];
        for(int i=0;i<arrays.length;i++){
            max=arrays[i]>max?arrays[i]:max;
        }
        System.out.println("Maximum value of array is "+max);

    }
}
