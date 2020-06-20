package lambadas;

public class RunnableLambadaExample {

	public static void main(String[] args) {
		/*
		 * Prior java 8
		 */

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Runnable 1");

			}
		};

		new Thread(runnable).start();

		// Java 8 Lambda

		// () -> {};

		Runnable runnableLambada = () -> {
			System.out.println("Inside Runnable 2");
		};
		
		Runnable runnableLambada1 = () -> System.out.println("Inside runnable 3");

		new Thread(runnableLambada).start();
		new Thread(runnableLambada1).start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside Runnable 3.1");
			}
		}).start();
		
		new Thread(() -> System.out.println("Inside runnable 4")).start();
		
	}

}
