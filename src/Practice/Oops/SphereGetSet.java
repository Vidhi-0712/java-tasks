package Practice.Oops;

class Sphere{
    private int r1;
    private int h1;

    void setSphere(int radius, int height){
        this.r1 = radius;
        this.h1 = height;
    }
    void getSphere(){
        System.out.println("Radius of Practice.Oops.Sphere :" +r1);
        System.out.println("Height of Practice.Oops.Sphere :" +h1);
    }
}

public class SphereGetSet {
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        s1.setSphere(2,3);
        s1.getSphere();
    }
}
