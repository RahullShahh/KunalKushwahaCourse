package Practice.ObjectOrientedProgramming.OOPS2;

public class Singleton {
    int num=0;
    private Singleton(){
        //this is a private constructor
        //you can add any custom constructor logic as per your need.
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            instance=new Singleton();
        }
        return instance;
    }
}
