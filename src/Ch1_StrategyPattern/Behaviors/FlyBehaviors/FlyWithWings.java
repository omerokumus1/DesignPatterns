package Ch1_StrategyPattern.Behaviors.FlyBehaviors;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Flying with my wings to the endless sky.");
    }
}
