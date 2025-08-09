package Oops;

class Cylinder{
    int r1;
    int h1;
    float pi= 3.14f;
    float volume;
    float surfaceArea;

    void setCylinder(int radius,int height){
        r1=radius;
        h1=height;
    }

    void getCylinder(){
        System.out.println("Radius of Practice.Oops.Cylinder is :"+r1);
        System.out.println("Height of Practice.Oops.Cylinder is :"+h1);
    }

    void getVolume(){
        volume= pi *r1*r1* h1;
        System.out.println("The volume of Practice.Oops.Cylinder is :"+volume);

    }

   void getSurfaceArea(){
        surfaceArea = 2 * pi * r1 * (r1+h1);
        System.out.println("The volume of Practice.Oops.Cylinder is :"+surfaceArea);
    }

}

public class Shapes2 {
    public static void main(String[] args) {
        Cylinder s1 = new Cylinder();
        s1.setCylinder(5,10);
        s1.getCylinder();

        s1.getVolume();
        s1.getSurfaceArea();
    }
}
