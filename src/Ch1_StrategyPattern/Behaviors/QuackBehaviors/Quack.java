package Ch1_StrategyPattern.Behaviors.QuackBehaviors;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck quacking");
    }
}
