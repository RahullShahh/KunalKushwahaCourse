package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Arrays  {
    public static void main(String[] args) {
        int[] arr = {23, 32, 4334};
//        System.out.println(arr[0]);
//        String val = "_";
//        System.out.println("String value" + val);
//
        Scanner inputs = new Scanner(System.in);
//        int[] nums = new int[5];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = inputs.nextInt();
//        }
//        for (int num : nums) {
//            System.out.print(num+" ");
//        }

        int[][] arrayObj = new int[2][2];

        System.out.println("Array Value :: "+arrayObj);
        for (int row = 0; row < arrayObj.length; row++) {
            for (int col = 0; col < arrayObj[row].length; col++) {
                arrayObj[row][col] = inputs.nextInt();
            }
        }
        System.out.println("Array Value :: "+arrayObj);

        for (int row = 0; row < arrayObj.length; row++) {
            System.out.print("[");
            for (int col = 0; col < arrayObj[row].length; col++) {
                System.out.print(" "+arrayObj[row][col]+" ");
            }
            System.out.println("]");
            System.out.println();
        }
//        for (int row = 0; row < arrayObj.length; row++) {
            for(int[] array:arrayObj){
                System.out.print(java.util.Arrays.toString(arrayObj));
            }
            System.out.println();
//        }
        System.out.println(java.util.Arrays.toString(arrayObj));
        for(int[] array:arrayObj){
            System.out.println(java.util.Arrays.toString(array));
        }

    }

}
