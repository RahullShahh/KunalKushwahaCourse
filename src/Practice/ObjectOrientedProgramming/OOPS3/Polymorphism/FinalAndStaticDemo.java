package Practice.ObjectOrientedProgramming.OOPS3.Polymorphism;

/*
 * if we make the below given class as final then we will restrict its ability to get inherited by other classes.
 *
 * other classes wont be able to extend this class anymore
 *
 * all the methods inside the final class are also final
 * that means that no method inside the final class can be overridden inside any other class
 *
 * NOTE : in final classes the member variables are not final instead if you want to make them
 * immutable then you will need to explicitly declare them as final variables
 */
//public final class FinalAndStaticDemo(){
public class FinalAndStaticDemo {

    /*
    * here the below method is declared as static which means that this method cannot be overridden
    * static methods are same for each and every object infact static methods are object independent
    *
    * since static methods are object independent while the overriding depends on objects of a class
    * thus we can conclude that static method cannot be overridden by the child class
    *
    * We can re implement the same method but that method will not override the method in the parent clas
    * instead it would be implementing the same signature method in the child class in same or different way
    *
    * While using a dynamic memory dispatch concept and calling a static method through that object
    * the method inside the reference type class will be invoked/executed and not the one that is implemented in the child class
    * */

     static void demoMethod(){
        System.out.println("Hello this is a demo static method that cannot be overridden by the child class.");
    }
}
