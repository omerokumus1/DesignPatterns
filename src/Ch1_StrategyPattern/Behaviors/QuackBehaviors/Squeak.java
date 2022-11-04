package Ch1_StrategyPattern.Behaviors.QuackBehaviors;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck squeaking");
    }
}
