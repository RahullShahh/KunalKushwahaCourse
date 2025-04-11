package Practice.ObjectOrientedProgramming.OOPS3;
public class Main {
   public static void main(String[] args){
      //calling different constructors of the box class and its child class BoxWeight
//       Box boxObj=new Box();
//       boxObj.printInformation();
//       Box boxObj1=new Box(4);
//       Box boxObj2=new Box(4,5,6);
//       Box boxObj3=new Box(boxObj2);
//       System.out.println();
//       boxObj1.printInformation();
//       System.out.println();
//       boxObj2.printInformation();
//       System.out.println();
//       boxObj3.printInformation();


       //We can also create an object for class Box by the below given approach
       Box boxObj=new BoxWeight(3,4,5,6);
       //here in the above given syntax we are creating an object for the left hand class
       //here the left hand class is the Box Class
       //by using the above syntax we can create an object for the Box Class and also
       //we can only access the member variables of the box class as the object is of BoxClass and not BoxObjectClass
       //therefore,
       System.out.println(boxObj.width);
       System.out.println(boxObj.height);
       System.out.println(boxObj.length);
//      the below given syntax is not allowed as the object cannot access the child class elements
//       System.out.println(boxObj.weight);


       /*
       * On the other hand if we try to create an object of the child class using the Base class
       * for initialization of the variables then it will not be allowed
       * as per the java rule you should have the right to initialize the variables for which the
       * object has been created
       * for example if you are creating an object for the child class then you should have the
       * right to initialize all the member variables of that object class using that constructor
       * */
       /*
       * Always you should be able to initialize the variables which you are allowed to access
       * Here you are allowed to access the weight variable but you dont have the right to initialize
       * the weight variable here which is not allowed as per java rules
       * */
//       BoxWeight boxWeightObj=new Box();
        BoxWeight boxWeightObj=new BoxWeight(3,4,5,6);
        BoxWeight objectDemo=new BoxWeight(boxWeightObj);
       System.out.println("Demo Data");
       System.out.println(objectDemo.weight);
       System.out.println(objectDemo.height);
       System.out.println(objectDemo.length);
       System.out.println(objectDemo.width);
       System.out.println(objectDemo.getWeightOfParent());
   }
}


















