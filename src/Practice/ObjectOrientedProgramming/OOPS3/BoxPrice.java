package Practice.ObjectOrientedProgramming.OOPS3;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        //if there is no super() constructor then we need to call any other constructor
        //to initialize the values of the super class member variables
        //if no super() is there
        //then call super(length, height, width, weight)
        //if super(length, height, width, weight) also not present then call any other existing constructor
        super();
        this.price=-1;
    }
    BoxPrice(BoxPrice object){
        super(object);
        this.price=object.price;

    }
    BoxPrice(int side, int weight,int price){
        super(side,weight);
        this.price=price;
    }
    BoxPrice(int length, int height, int width, int weight,double price){
        super(length, height, width ,weight);
        this.price=price;
    }

}
