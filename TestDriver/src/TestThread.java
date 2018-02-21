


public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.sleep(5000);
		t2.start();
		
		
	}
	
}

class Thread1 extends Thread{
	
	public void run(){
		
		System.out.println("i am in thread1");
		
	}
	
}

class Thread2 extends Thread{
	
	public void run(){
		
		System.out.println("i am in thread2");
		
	}
	
}