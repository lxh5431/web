package strategymaintest;

public class MiniDuckTest {
	public static void main(String[] args) {
		Duck duck=new MallardDuck();
		duck.performFly();
		duck.performQuack();
		Duck model=new MallardDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
