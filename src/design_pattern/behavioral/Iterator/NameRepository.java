package design_pattern.behavioral.Iterator;

public class NameRepository {

    private String[] names = {"Adam", "Ana", "Kevin", "Micheal"};

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
