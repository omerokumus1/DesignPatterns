package Ch1_StrategyPattern;

import Ch1_StrategyPattern.Behaviors.FlyBehaviors.FlyNoWay;
import Ch1_StrategyPattern.Behaviors.FlyBehaviors.FlyRocketPowered;
import Ch1_StrategyPattern.Ducks.Duck;
import Ch1_StrategyPattern.Ducks.MallardDuck;
import Ch1_StrategyPattern.Ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        if (isHit())
            mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

    private static boolean isHit() {
            return true;
    }


}
