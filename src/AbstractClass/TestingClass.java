package AbstractClass;

public class TestingClass {
    public static void main(String[] args){

        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal lion = new Animal("lion");

        dog.action();
        cat.action();
        lion.action();


    }
}
