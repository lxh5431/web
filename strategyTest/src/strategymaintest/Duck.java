package strategymaintest;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QoackBehavior qoackBehavior;
	
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQoackBehavior(QoackBehavior qoackBehavior) {
		this.qoackBehavior = qoackBehavior;
	}
	public abstract void display();
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		qoackBehavior.quack();
	}
	public void swim(){
		System.out.println("All ducks float,even decoys!");
	}

}
