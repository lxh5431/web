package decoratortest;

public class RedBeanMilkTea extends CondimentDecorator {
	MilkyTea milkyTea;
	

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return milkyTea.description+",redbean";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.14+milkyTea.cost();
	}

	public RedBeanMilkTea(MilkyTea milkyTea) {
		super();
		this.milkyTea = milkyTea;
	}
	

}
