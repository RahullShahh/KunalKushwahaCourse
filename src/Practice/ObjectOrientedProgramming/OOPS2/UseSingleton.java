package Practice.ObjectOrientedProgramming.OOPS2;

public class UseSingleton {
    public static void main(String[] args) {
        //here we have created singleton class
        //in this singleton class we can only create one object of the Singleton class
        /*
        * here the constructor of the singleton class is declared as private
        * which means that the constructor can not be called from any other class
        * then we have created a public method of the class Singleton which is
        * responsible to return the private instance of the Singleton class
        * this method ensures that the only one instance of the singleton class
        * is getting created and that one instance is only assigned or allocated
        * at the time of function call of getInstance();
        * */
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        Singleton object3 = Singleton.getInstance();
        Singleton object4 = Singleton.getInstance();
    }
}
