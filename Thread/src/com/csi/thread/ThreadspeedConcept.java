package com.csi.thread;

class Pushpak extends Thread {
	public void run() {
		for (int i = 0; i <= 4; i++)
			
		try {
			Thread.sleep(500);
			System.out.println("Cricket ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class ThreadspeedConcept {
	public static void main(String[] args) {
		Pushpak kk = new Pushpak();
		kk.start();
	}
}
