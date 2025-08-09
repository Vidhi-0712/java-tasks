package Oops;

interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("Practice.Oops.Monkey is Jumping");
    }
    void bite(){
        System.out.println("Practice.Oops.Monkey is biting");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("biting");
    }
}

public class InterfaceProgram {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();
        Monkey m = new Monkey();
        m.bite();
        m.jump();
    }
}
