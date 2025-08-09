package Oops;

class Circle{
    int r;

    Circle(int radius){
        this.r = radius;
        System.out.println("The radius of circle is :"+radius);
    }
}
class Sphere3 extends Circle{
    int h;
    Sphere3(int radius,int height){
        super(radius);
        this.h = height;
        System.out.println("The radius of Practice.Oops.Sphere is :"+ radius);
        System.out.println("The height of Practice.Oops.Sphere is :"+height);
    }
}

public class Shapes3 {
    public static void main(String[] args) {
        Circle s1 = new Circle(5);
        Sphere3 s2 = new Sphere3(7,10);
    }
}
