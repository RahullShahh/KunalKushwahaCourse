package Practice.ObjectOrientedProgramming.OOPS2;

public class InnerClasses {

    /*since the static block of codes are not dependent on
    * any object of the class thus the static blocks are always
    * evaluated at compile time and not on runtimes
    * */
    static class Test{
        int a;
        int b;
    }

    public static void main(String[] args){
        Test object=new Test();
    }
}
