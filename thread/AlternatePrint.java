package thread;

public class AlternatePrint {
	private static final Object lock = new Object();
	private static boolean printRaju = true;

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				synchronized (lock) {
					while (!printRaju) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
						}
					}
					System.out.println("Raju");
					printRaju = false;
					lock.notify();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				synchronized (lock) {
					while (printRaju) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
						}
					}
					System.out.println("Goriparthy");
					printRaju = true;
					lock.notify();
				}
			}
		});

		t1.start();
		t2.start();
	}
}
