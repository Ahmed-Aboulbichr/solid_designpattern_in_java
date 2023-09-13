package design_pattern.behavioral.strategy;

// abstract layer in between the high level modules and the low level modules
public class OperationManager {

    // We have to use composition
    // BECAUSE the behavior can be changed at run-time
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2){
        System.out.println(this.strategy.execute(num1, num2));
    }
}
