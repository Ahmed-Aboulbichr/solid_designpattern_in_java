package design_pattern.behavioral.Iterator;

public class App {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(Iterator it = nameRepository.getIterator(); it.hasNext();){
            String name = (String) it.next();
            System.out.println(name);
        }
    }
}
