package Ch1_StrategyPattern.Ducks;

import Ch1_StrategyPattern.Behaviors.FlyBehaviors.FlyNoWay;
import Ch1_StrategyPattern.Behaviors.QuackBehaviors.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I'm a Model duck");
    }
}
