package com.csi.thread;

class Swapnil implements Runnable
{

	@Override
	public void run() {
		
		for(int i=0;i<=5;i++){
		try {
			Thread.sleep(1000);
			System.out.println("Ala Motha Shana!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
			
		}
		
	}
	
}


public class ImplementsRunnable {
public static void main(String[] args) {
	Swapnil tu=new Swapnil();
	Thread tt=new Thread(tu);
		tt.start();	
}
}
