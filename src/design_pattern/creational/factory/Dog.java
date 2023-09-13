package design_pattern.creational.factory;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }
}
