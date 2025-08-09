package Oops;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class GelPen extends Pen{
    public void write(){
        System.out.println("I am writing");
    }
    public void refill(){
        System.out.println("I am refilling");
    }
}
class FountainPen extends Pen{
    void ChangeNib(){
        System.out.println("Changing the nib");
    }
    public void write(){
        System.out.println("writting with fountain pen");
    }

    public void refill(){
        System.out.println("Refilling the fountain pen");
    }
}

public class AbstractProgram {
    public static void main(String[] args) {
        GelPen gp = new GelPen();
        gp.write();
        gp.refill();

        FountainPen fp = new FountainPen();
        fp.ChangeNib();
        fp.write();
        fp.refill();
    }
}
