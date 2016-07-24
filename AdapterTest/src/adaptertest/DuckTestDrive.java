package adaptertest;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck=new MallardDuck();
		WildTurkey turkey=new WildTurkey();
		Duck turkeyAdapter=new TurkeyAdapter(turkey);
		System.out.println("the Turkey says...");
		turkey.gobble();
		turkey.fly();
		System.out.println("\n The Duck says...");
		testDuck(duck);
		System.out.println("\n The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	private static void testDuck(Duck duck) {
		// TODO Auto-generated method stub
		duck.fly();
		duck.quack();
		
	}

}
