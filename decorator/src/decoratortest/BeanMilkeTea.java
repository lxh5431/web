package decoratortest;

public class BeanMilkeTea extends MilkyTea{
public BeanMilkeTea(){
	description="Tea";
}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.3;
	}

}
