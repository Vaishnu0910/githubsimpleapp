package com.csi.thread;

class Vishal extends Thread {
	public void run() {
		int i = 1;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("CSI PUNE");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class ThreadConcept {
	public static void main(String[] args) {
Vishal vv=new Vishal();
vv.start();

	}
}
