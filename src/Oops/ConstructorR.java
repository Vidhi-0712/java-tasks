package Oops;

class RectangleR{
    private int l1;
    private int b1;

    public RectangleR(){
        System.out.println("This is Default Practice.Oops.Constructor");
    }

    public RectangleR(int length, int breadth){
        this.l1 = length;
        this.b1 = breadth;
        System.out.println("Length of Rectangle :"+l1);
        System.out.println("Breadth of Rectangle :"+b1);
    }
}

public class ConstructorR {
    public static void main(String[] args) {
        RectangleR r1 = new RectangleR();
        RectangleR r2 = new RectangleR(4,5);
    }
}
