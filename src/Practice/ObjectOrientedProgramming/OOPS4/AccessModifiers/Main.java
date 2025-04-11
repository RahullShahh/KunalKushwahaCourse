package Practice.ObjectOrientedProgramming.OOPS4.AccessModifiers;

public class Main   {
    /*
    * here if we extend the A Class using the Main class then
    * we would mandatorily need to implement a constructor that explicitly calls the
    * custom made constructor in the super class A as since we have given atleast one
    * non default constructor in the A class then we would necessarily need to call the custom made constructor
    * in order to make java aware about which constructor of the super class should be called when java compiler
    * implicitly invokes the constructor of this Class then which supercontructor should be called
    * as there is no default super constructor available to call at the moment
    * */
    public static void main(String[] args){
        A objectA=new A(10,"Hello");
        //numPrivate has private access modifier hence cannot be accessed here
        //objectA.numPrivate;
        int demoProtected=objectA.numProtected;     // ALLOWED
        int demoPublic=objectA.numPublic;       //ALLOWED
        int demoDefault=objectA.numDefault;     //ALLOWED
    }
}
