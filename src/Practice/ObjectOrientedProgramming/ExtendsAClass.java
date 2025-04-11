package Practice.ObjectOrientedProgramming;

import Practice.ObjectOrientedProgramming.OOPS4.AccessModifiers.A;
public class ExtendsAClass extends A{

    public ExtendsAClass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args){
        ExtendsAClass objectExtendsAClass=new ExtendsAClass(10,"Hello");
        A objectOfA=new A(10,"DemoName");
        int demoPublic=objectOfA.numPublic;     //ALLOWED
//        int demoProtected=objectOfA.numProtected;     //NOT ALLOWED TO ACCESS BY PARENT CLASS
        int demoProtected=objectExtendsAClass.numProtected;     //ALLOWED TO BE ACCESSED BY CHILD CLASS
    }
}
