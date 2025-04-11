package Practice.ObjectOrientedProgramming.OOPS3.Polymorphism;

public class Main {
    public static void main(String [] args){

        /*
        * Here in the below example the shapes class is the reference type class
        * whereas the square class is the object type class now the thing here is that
        * whenever we use dynamic memory dispatch approach to create an object at that time
        * the reference type of the object determines that what all member variables can the object access
        * while the object type will determine which constructor or method will be used or called in order
        * to get the value of that member variable or function
        * ------------------------------------------------------------------------------------------------
        * the process of deciding the method or constructor to be used is called as dynamic polymorphism
        * or can also be called as runtime polymorphism as the decision of which method / constructor
        * will be called during execution is made by java compiler at run time itself
        * */
        Shapes object=new Square();
        object.area();
    }
}
