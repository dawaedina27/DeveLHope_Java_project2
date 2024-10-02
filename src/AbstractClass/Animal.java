package AbstractClass;

public abstract class Animal {
    protected String Animal;

    public Animal(String Animal) {
        this.Animal = Animal;
    }

    public void speak(){
        System.out.println("The animal makes a sound");
    }

    public void action() {
    }
}
abstract class Dog extends Animal {

    public Dog(String Animal) {
        super(Animal);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("The Dog bargs");
    }
}

abstract class Cat extends Animal {

    public Cat(String Animal) {
        super(Animal);
    }
}

class Goat extends Animal {

    public Goat(String Animal) {
        super(Animal);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("The Goat");
    }
}
