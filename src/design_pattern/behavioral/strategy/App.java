package design_pattern.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        OperationManager operationManager = new OperationManager();
        operationManager.setStrategy(new Addition());
        operationManager.execute(5, 3);
    }
}
