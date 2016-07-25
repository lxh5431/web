package templatemethodtest1;

public abstract class CaffeineBeverageWithHook {
	void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	private boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}
	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("Pouring into cup");
		
	}
	abstract void brew();
	abstract void addCondiments();
	void boilWater(){
		System.out.println("Boiling water");
	}
	

}
