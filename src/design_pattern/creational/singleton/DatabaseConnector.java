package design_pattern.creational.singleton;

public class DatabaseConnector {

    // eager version
    // private static DatabaseConnector INSTANCE = new DatabaseConnector();

    // lazy version
    private static DatabaseConnector INSTANCE;

    // we are not able to instantiate the class
    // despite we have private constructor, " reflection attack "
    // we will use enum solution
    private DatabaseConnector(){

    }

    public static DatabaseConnector getInstance(){
        // we just instantiate the class if necessary
        // if we have multiple Threads ???
        if(INSTANCE == null){
            // this block can be entered by a single thread
            // PROBLEM : it is too slow (100x)
            synchronized (DatabaseConnector.class){
                INSTANCE = new DatabaseConnector();
            }
        }
        return INSTANCE;
    }

    public void connect(){
        System.out.println("Connecting to the database...");
    }

    public void disconnect(){
        System.out.println("Disconnecting ...");
    }

}
