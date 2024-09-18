class Animal {
    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {                      //Inheritance
    @Override                       // overriding
    public void makeSound() {
        System.out.println("Bark!!");
    }
}

class Cat extends Animal {                   //Inheritance
    @Override                                      // overriding
    public void makeSound() {
        System.out.println("Mew!!");
    }
}

public class AnimalMain {
    public static void main(String args[]) {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        dog1.makeSound();
        cat1.makeSound();
    }
}

