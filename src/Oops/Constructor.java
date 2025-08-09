package Oops;

class Cylinder2{
    private int radius;
    private int height;
    public Cylinder2 (int r2, int h2){
        this.radius = r2;
        this.height = h2;

        System.out.println("Radius :"+ radius);
        System.out.println("Height :"+height);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Cylinder2 s2 = new Cylinder2(10,15);

    }
}
