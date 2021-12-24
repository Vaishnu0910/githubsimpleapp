package com.csi.thread;

class Table {
	synchronized public void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);

				System.out.println(i * n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class MyThread1 extends Thread {
	Table t;

	public MyThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;

	public MyThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class MyThread3 extends Thread {
	Table t;

	public MyThread3(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	public void run() {
		t.printTable(1000);
	}
}

class MyThread4 extends Thread {
	Table t;

	public MyThread4(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	public void run() {
		t.printTable(10000);
	}
}

class MyThread5 extends Thread {
	Table t;

	public MyThread5(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	public void run() {
		t.printTable(100000);
	}
}

public class SynchronisationThread {
public static void main(String[] args) {
	
}
}
