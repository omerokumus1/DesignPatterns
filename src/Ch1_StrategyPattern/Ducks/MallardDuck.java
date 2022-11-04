package Ch1_StrategyPattern.Ducks;

import Ch1_StrategyPattern.Behaviors.FlyBehaviors.FlyWithWings;
import Ch1_StrategyPattern.Behaviors.QuackBehaviors.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
