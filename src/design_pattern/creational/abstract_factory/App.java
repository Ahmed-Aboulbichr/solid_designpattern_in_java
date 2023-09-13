package design_pattern.creational.abstract_factory;

public class App {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("PETROL");
        factory.getCar("FORD").assemble();
    }
}
