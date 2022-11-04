package Ch1_StrategyPattern.Behaviors.FlyBehaviors;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm sorry that I can't fly :(");
    }
}
