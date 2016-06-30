package task;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("asd");
		for(int i = 1;i<5;i++){
			s.append(i);
			
		}
		System.out.println(s);
	}

}
