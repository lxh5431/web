package synchronizedTest;

public class SynchronizedDemo {
	private boolean ready=true;
	private int result=0;
	private int number=1;
	public void write(){
		ready=true;
		number=2;
	}
	public void read(){
		if(ready){
			result=number*3;
		}
		System.out.println("½á¹ûÎª£º"+result);
	}

private class NewThread extends Thread{
		private boolean flag;

		public NewThread(boolean flag) {
			
			this.flag = flag;
		}
		
		
	
	public void run(){
		if(flag){
			write();
			
		}
		else{
			read();
		}
	}
}
public static void main(String[] args)throws Exception {
	SynchronizedDemo synDemo=new SynchronizedDemo();
	synDemo.new NewThread(false).start();
	try{
		Thread.sleep(100);
	}catch(Exception e){
		e.printStackTrace();
	}
	
	synDemo.new NewThread(true).start();
}
}

