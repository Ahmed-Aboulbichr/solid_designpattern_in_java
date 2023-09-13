package design_pattern.creational.factory;

public class App {

    public static void main(String[] args) {
        Animal cat = AnimalFactory.getAnimal(AnimalType.DOG);
        cat.eat();
    }
}
