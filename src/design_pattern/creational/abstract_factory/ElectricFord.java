package design_pattern.creational.abstract_factory;

public class ElectricFord implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling "+ this.getClass().getSimpleName() +" car ");
    }
}
