package Practice.ObjectOrientedProgramming.OOPS2;

public class Human {
    int age;
    String name;
    int salaryPerMonth;
    boolean isMarried;
    static long population=3;

    static void message(){
        //you are allowed only to access the static variables or members;
        System.out.println("Hello World!");
    }

    public Human(int age, String name, int salaryPerMonth, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.isMarried = isMarried;
        Human.population += 1;

        Human.message();
    }
}
