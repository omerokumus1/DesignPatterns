package Ch1_StrategyPattern.Ducks;

import Ch1_StrategyPattern.Behaviors.FlyBehaviors.FlyBehavior;
import Ch1_StrategyPattern.Behaviors.QuackBehaviors.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks can float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }


}
