package Ch1_StrategyPattern.Behaviors.QuackBehaviors;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("No quacking");
    }
}
