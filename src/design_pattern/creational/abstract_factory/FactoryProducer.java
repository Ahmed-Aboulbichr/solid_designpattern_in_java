package design_pattern.creational.abstract_factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type){
        if(type.equals("ELECTRIC")){
            return new ElectricCarFactory();
        } else if (type.equals("PETROL")) {
            return new PetrolCarFactory();
        }
        return null;
    }
}
