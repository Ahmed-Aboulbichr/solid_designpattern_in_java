package design_pattern.creational.abstract_factory;

public class PetrolToyota implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling "+ this.getClass().getSimpleName() +" car ");
    }
}
