package decoratortest;
/**
 * 
 * @author lxh
 * @version 1.0
 *
 */

public abstract class MilkyTea {
	String description="Unknow Tea";

	public String getDescription(){
		return description;
	}
	public abstract double cost();
	

}
