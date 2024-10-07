package adv1.thread;

import static util.Logger.log;

public class InnerRunnableMainV2 {
	public static void main(String[] args) {
		log("main() start");

		Runnable runnable = () -> log("run()");

		Thread thread = new Thread(runnable);
		thread.start();

		log("main() end");
	}
}
