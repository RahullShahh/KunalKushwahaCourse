package Practice.ObjectOrientedProgramming.OOPS2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Default value of population:" + Human.population);

        Human rahul = new Human(25, "Rahul Shah", 500000, false);
        Human devesh = new Human(24, "Devesh Chaubey", 600000, false);
        System.out.println("Population values:");
        System.out.println(rahul.population);
        System.out.println(devesh.population);
    }

    static void demoFunction() {
        //here just calling greetings() method would be errornous
        //because here for calling greetings function we would require
        //atleast an object of the class but since demoFunction is
        //a static block thus it can be called by either class or object
        //since there is no guarantee that demoFunction will always be
        //called from an object we cannot directly write call the greetings() method here.

//NOT ALLOWED ->        greetings();
        //instead we can call the greetings method here by using an object
//ALLOWED
        Main mainObj=new Main();
        mainObj.greetings();

    }

    void greetings() {
        System.out.println("Hello! How are you Mr/Ms Object ?");
    }
}
