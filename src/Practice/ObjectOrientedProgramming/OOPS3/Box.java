package Practice.ObjectOrientedProgramming.OOPS3;

public class Box {
    int length;
    int width;
    int height;
    double weight;
    public Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Box(int sideSize) {
        this.length = sideSize;
        this.width = sideSize;
        this.height = sideSize;
    }

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box oldBox){
        this.length=oldBox.length;
        this.width=oldBox.width;
        this.height=oldBox.height;
    }

    public void printInformation() {
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
    }
}
