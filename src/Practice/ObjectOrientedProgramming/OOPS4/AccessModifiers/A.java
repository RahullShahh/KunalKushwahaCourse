package Practice.ObjectOrientedProgramming.OOPS4.AccessModifiers;

public class A extends Object {
    /*
    * --------------------------------------------------------------------------------------------------------------
    * If the below given int num is declared as private then we wont be able to access the num variable
    * anywhere outside of this class without the use of getters and setters
    * A variable that is declared under a private implementation can be accessed and set by using
    * getters and setters methods
    *
    * Using the setters methods we can set the value of private variable as per our choice
    * Using the getters methods we can get the value of private varaible as per our need
    * IMPLEMENTATION :- private int num;
    * --------------------------------------------------------------------------------------------------------------
    *
    * --------------------------------------------------------------------------------------------------------------
    * If we have declared the below given num as protected then we will only be able to access it
    * in the same package or in the subclasses that extends this A class
    *
    * If this variable is declared as protected then we cannot access this variable by using the
    * object of the A class inside of the child class as the A class wont be aware of which all
    * classes would be extending it hence we can only be able to access the value of this variable
    * using the child class object and not the base class object
    * eg:
    * A objectA= new A();
    * objectA.num; // Not Allowed as we cannot access the protected values from Parent class object
    *
    * lets assume AChild is a class inheriting A class
    * that means AChild will be allowed to access the num member variable
    * AChild objectAChild=new AChild();
    * objectAChild.num; //Allowed as this variable is accessed by the child class object and not by the parent class object
    *
    *
    * IMPLEMENTATION :- protected int num;
     * --------------------------------------------------------------------------------------------------------------
    *
    *
    * --------------------------------------------------------------------------------------------------------------
    * If we have declared the below given num as default or without any specification
    * then the scope of the variable will only be limited to the same package and no other class
    * outside the package would be able to access the int num member variable
    * IMPLEMENTATION :- default int num;
    * --------------------------------------------------------------------------------------------------------------
    *
    *
    * --------------------------------------------------------------------------------------------------------------
    * If we have declared the below given num as public then we would be able to access
    * the num variable anywhere in out project even inside a class that doesn't inherit the A class
    * and even inside a class that is not located in the same package
    * IMPLEMENTATION :- public int num;
    * --------------------------------------------------------------------------------------------------------------
    * */
    public int numPublic;
    private int numPrivate;
    protected int numProtected;
    int numDefault;
    String name;
    int[] arr;

    public A(int num, String name) {
//        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
