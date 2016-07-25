package templatemethodtest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook  extends CaffeineBeverageWithHook{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping Coffee through filter");
		
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Suger and Mink");
		
	}
	public boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		String answer=getUserInput();
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else{
			return false;
		}
	}

	private String getUserInput() {
		// TODO Auto-generated method stub
	String answer=null;
	System.out.println("Would you like milk and sugar with your xoffee(y/n)?");
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	try{
		answer=in.readLine();
	}catch(IOException e){
		System.out.println("IO err trying to read your answer");
	}
	if(answer==null){
		return "no";
	}
	return answer;
	}
	

}
