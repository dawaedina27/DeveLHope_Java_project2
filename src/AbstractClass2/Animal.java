
//create lion, dog and cat classes from Animal class and create an objects from these 3 class then use action function.
package AbstractClass2;

class main{
    public static void main(String[] args){

        Animal Dog = new Dog("dog");
        Animal Cat = new Cat("cat");
        Animal lion = new Lion("lion");

        Dog.action();
        Cat.action();
        lion.action();


    }
}





public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }


    public void speak(){
        System.out.println("The animal makes a sound");
    }

    public abstract void speak(String name);

    public void action() {
        System.out.println("The" +name + "is eating");
    }
}
class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void speak(String name) {
        super.speak();
        System.out.println("The" + name + "bargs");
    }

    @Override
    public void action() {
        super.action();
        System.out.println("The" +name + "is eating");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("The" +name + "is eating");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("The Dog barks")
    }

    @Override
    public void speak(String name) {

    }
}

class Cat extends AbstractClass.Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("The Cat say Meow");
    }
}

