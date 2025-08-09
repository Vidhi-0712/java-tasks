package Oops;

class Square{
    int side;

    public void setsides(int a) {
         side = a;
    }
    public int area(){
       int product = side*side;
        return(product);
    }
    public int perimeter(){
       int peri= 4*side;
        return(peri);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Square obj1= new Square();

        obj1.setsides(8);
        System.out.println("Area of a Practice.Oops.Square is"+ obj1.area());
        System.out.println("Perimeter of this Practice.Oops.Square is"+ obj1.perimeter());

    }
}
