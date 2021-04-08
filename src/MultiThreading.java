import java.util.Random;

class NewThread extends Thread {

	synchronized void call() {
		Random rand = new Random();
		int x = rand.nextInt(100);
		System.out.println("Random integer : " + x);
		if (x % 2 == 0) {
			NewSquare ns = new NewSquare(x);
			ns.start();
		} else {
			NewCube nc = new NewCube(x);
			nc.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
	}

	public void run() {
		call();
	}
}

class NewSquare extends Thread {
	int n;

	NewSquare(int a) {
		n = a;
	}

	public void run() {
		System.out.println("Square of random number : " + (n * n));
	}
}

class NewCube extends Thread {
	int n;

	NewCube(int a) {
		n = a;
	}

	public void run() {
		System.out.println("Cube of random number : " + (n * n * n));
	}
}

public class MultiThreading {
	public static void main(String args[]) {

		NewThread t1 = new NewThread();
		t1.start();
		t1.run();
		t1.run();
	}
}
