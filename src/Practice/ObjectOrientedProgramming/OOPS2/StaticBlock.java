package Practice.ObjectOrientedProgramming.OOPS2;

public class StaticBlock {
    static int value1=4;
    static int value2;

    static{
        System.out.println("Inside of static block");
        value2=value1*5;
        System.out.println("Value 1 :"+value1);
        System.out.println("Value 2 :"+value2);
        System.out.println("Static block completed");
    }


    public static void main(String[] args){
        StaticBlock staticBlockObj=new StaticBlock();

        StaticBlock.value2+=2;
        System.out.println();
        System.out.println("Value 2 :"+value2);
        System.out.println("-------------");

        //here even if we have reinvoked the staticblock class then also the static code block is
        //not called or invoked again instead it was called only when the class was loaded initially
        StaticBlock staticBlockClassReinitializedObject=new StaticBlock();
        System.out.println();
        System.out.println("Value 1: "+value1);
        System.out.println("Value 2: "+value2);
    }
}
