package corejava;

public class Multi extends Thread {
	
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		Multi t1=new Multi();  
		t1.start(); //it starts an execution of the Thread and once it has started run() will invoke and Perform its action on the thread.
		 }  
		}  
