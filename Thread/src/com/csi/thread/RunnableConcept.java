package com.csi.thread;
class ThreadJava implements Runnable {
	public void run(){
		for(int i=0;i<=3;i++){
			try {
				Thread.sleep(2500);
				System.out.println("Credit System India");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
}
public class RunnableConcept {
public static void main(String[] args) {
	ThreadJava yy=new ThreadJava();
	Thread tt=new Thread(yy);
	tt.start();
}
}
