package design_pattern.creational.factory;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }
}
