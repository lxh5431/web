package strategymaintest;

public class MallardDuck extends Duck {
	  public MallardDuck(){
		  qoackBehavior=new Qoack();
		  flyBehavior=new FlyWithWings();
	  }
	public  void display(){
	System.out.println("I am a real mallard duck");	
	}

}
