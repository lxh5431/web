package decoratortest;
/**
 * 
 * @author lxh
 * @deprecated в╟йндёй╫
 *
 */

public class DecoratorTest {
	public static void main(String[] args) {
		MilkyTea milkTea = new BeanMilkeTea();
		System.out.println(milkTea.getDescription() + " " + "$" + milkTea.cost());
		MilkyTea milkTea1 = new RedBeanMilkTea(milkTea);
		System.out.println(milkTea1.getDescription() + "$" + milkTea1.cost());

	}

}
