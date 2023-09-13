package design_pattern.creational.factory;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType type){
        if(type.equals(AnimalType.DOG)){
            return new Dog();
        } else if (type.equals(AnimalType.CAT)) {
            return new Cat();
        } else if (type.equals(AnimalType.LION)) {
            return new Lion();
        }
        return null;
    }
}
