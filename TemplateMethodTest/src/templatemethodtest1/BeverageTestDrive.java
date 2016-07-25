package templatemethodtest1;

public class BeverageTestDrive {
	public static void main(String[] args) {
		CoffeeWithHook coffeeHook=new CoffeeWithHook();
		System.out.println("Makeing coffee...");
		coffeeHook.prepareRecipe();
	}

}
