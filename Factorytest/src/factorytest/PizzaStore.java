package factorytest;

public abstract class PizzaStore {
	 abstract Pizza createPizza(String item);
	 
	  public Pizza orderPizza(String type) {
	    //创建对象的接口
	    Pizza pizza = createPizza(type);
	    System.out.println("--- Making a " + pizza.getName() + " ---");
	    pizza.prepare();
	    pizza.bake();
	    pizza.cut();
	    pizza.box();
	    return pizza;
	  }
	}



