package design_pattern.creational.singleton;

public class App {

    public static void main(String[] args) {
        DatabaseConnector databaseConnector1 = DatabaseConnector.getInstance();
        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();

        if(databaseConnector1 == databaseConnector2){
            System.out.println("Both are equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
