package Oops;

class Rectangle3{
    int l1;
    int w1;
    int area;
    int perimeter;

    Rectangle3(int length, int width){
        this.l1 = length;
        this.w1 = width;
        System.out.println("Length of Rectangle is :"+l1);
        System.out.println("Width of Rectangle is :"+w1);
    }

    void getArea(){
        area = l1 * w1;
        System.out.println("The area of Rectangle is :"+area);
    }

    void getPerimeter(){
        perimeter = 2 * (l1+w1);
        System.out.println("The Perimeter of Rectangle is:"+perimeter);
    }
}

class Cuboid extends Rectangle3{
    int h1;
    int surfaceArea;
    int latSA;
    int volume;

    Cuboid(int length, int width, int height) {
        super( length, width);
        this.l1=length;
        this.w1=width;
        this.h1=height;
        System.out.println("The Length of Practice.Oops.Cuboid is :"+l1);
        System.out.println("The Width of Practice.Oops.Cuboid is :"+w1);
        System.out.println("The Height of Practice.Oops.Cuboid is :"+h1);
    }

    void getSurfaceArea(){
        surfaceArea = 2*((l1*w1)+ (w1*h1) +(h1*l1));
        System.out.println("Surface Area of Practice.Oops.Cuboid is: "+surfaceArea);
    }

    void getLateralSurfaceArea(){
        latSA = 2 * h1 * (l1+w1);
        System.out.println("The Lateral Surface Area of a Practice.Oops.Cuboid is :"+latSA);
    }

    void getVolume(){
        volume = l1 * w1 * h1;
        System.out.println("The Volume of Practice.Oops.Cuboid is :"+volume);
    }
}

public class MainShapes {
    public static void main(String[] args) {
        Rectangle3 r = new Rectangle3(2,3);
        r.getArea();
        r.getPerimeter();

        Cuboid c = new Cuboid(3,4,5);
        c.getSurfaceArea();
        c.getLateralSurfaceArea();
        c.getVolume();
    }
}
