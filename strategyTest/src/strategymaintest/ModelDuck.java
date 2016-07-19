package strategymaintest;

public class ModelDuck  extends Duck{
   public ModelDuck(){
	   flyBehavior=new FlyNoWay();
	   qoackBehavior=new Qoack();
   }
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model Duck");
	}

}
