package design_pattern.creational.prototype;

public class Rectangle extends Shape{

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName()+ " with W : "+ width+ ", H : "+height);
    }

    @Override
    public Shape cloneObject() {
        // this is the prototype pattern
        return new Rectangle(width, height);
    }
}
