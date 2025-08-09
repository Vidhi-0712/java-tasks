package Oops;

class Animal {
    void sound() {
        System.out.println("Makes a sound ");
    }
}

    class Dog extends Animal {
        void bark() {
            System.out.println("Barks");
        }
    }

    public class mainAnimal {
        public static void main(String[] args) {
            Dog d = new Dog();
          // d.sound();  // Inherited
           d.bark();   // Own method

        }
    }
