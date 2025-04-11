package Practice.ObjectOrientedProgramming.OOPS3;

public class BoxWeight extends Box {
    int weight;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(int length, int height, int width, int weight) {
        //super class is only allowed to be called at the very start of the child constructor method
        super(length,width,height);
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;

        //you are not allowed to call the super constructor here as all the values of the
        //parent class should be initialized before the child class uses it
        //        super(length,width,height);

        //it might happen that the parent class and the child class both of them may have
        //the same member variable names like weight and weight in such case
        //we can specifically decide on to which one do we want to call
        //this can be done by using the below syntax
        //to call the weight member variable of the child class(inherited class) use below syntax
        System.out.println(this.weight);
        //the below syntax is used to call the weight member variable of the base class(parent class/super class)
        System.out.println(super.weight);
    }
    BoxWeight(BoxWeight boxWeightObject) {
        super(boxWeightObject);
        this.weight = boxWeightObject.weight;
        super.weight = boxWeightObject.weight + 2;
    }
    BoxWeight(int side,int weight){
        super(side);
        this.weight=weight;
    }
    public double getWeightOfParent(){
        return super.weight;
    }
}
