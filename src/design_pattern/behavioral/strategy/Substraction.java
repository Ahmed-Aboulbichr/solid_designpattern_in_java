package design_pattern.behavioral.strategy;

public class Substraction implements Strategy{
    @Override
    public int execute(int num1, int num2) {
        return num1 - num2;
    }
}
