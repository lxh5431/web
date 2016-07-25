package templatemethodtest;

public class Duck implements Comparable {
	String name;
	int weight;
	

	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String toString(){
		return name+"weight"+" "+weight;
		
	}


	@Override
	public int compareTo(Object object) {
		// TODO Auto-generated method stub
		Duck otherDuck=(Duck) object;
		if(this.weight<otherDuck.weight){
		return -1;
		}else if(this.weight==otherDuck.weight){
			return 0;
		}else{
			return 1;
		}
	}

}
