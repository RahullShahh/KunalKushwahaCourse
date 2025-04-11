package Practice.ObjectOrientedProgramming;

/*
 * NOTE *
 * Whenever we call a function or method with the help of an existing object at that time
 * writing this might be optional but while creating a new object at that time we are not
 * calling the constructor method as an extension method of any particular object so at that
 * time we should use 'this' keyword to explicitly mention that the following method is being
 * called by a particular object which is referenced by 'this' keyword.
 * */

public class Main {
    public static void main(String args[]) {
        Student stud = new Student(10, "Rohan", 91.87f);
        System.out.println("Student 1");
        System.out.println("Marks: " + stud.marks);
        System.out.println("RollNo: " + stud.rollNo);
        System.out.println("Name: " + stud.name);


        Student stud2 = new Student(stud);
        System.out.println("Student 2");
        System.out.println("Marks: " + stud2.marks);
        System.out.println("RollNo: " + stud2.rollNo);
        System.out.println("Name: " + stud2.name);
        //the importance of this keyword is that it always takes
        //the object from which the method or class is being called
        stud.greetWithName();


        //calling a constructor inside another constructor
        /*
        in this I want to set the Student() constructor as a constructor that invokes
        another constructor inside it to set the values of the variables of the object
        */
        System.out.println();
        Student stud3 = new Student();
        System.out.println("Student 3");
        System.out.println("Marks: " + stud3.marks);
        System.out.println("RollNo: " + stud3.rollNo);
        System.out.println("Name: " + stud3.name);
    }
}

class Student {
    int rollNo;
    String name;
    float marks;

    void greetWithName() {
        System.out.println();
        System.out.println("*-*-*-*- Greetings -*-*-*-*");
        System.out.println("Hello! You're welcome Mr/Ms : " + name);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    //Default Constructor
    Student() {
         this(0,"No Name",00.00f);
//        this.rollNo=0;
//        this.name="No Name";
//        this.marks=00.00f;
    }

    //Parameterized Constructor
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(Student otherStudent) {
        this.name = otherStudent.name;
        this.rollNo = otherStudent.rollNo;
        this.marks = otherStudent.marks;
    }
}
