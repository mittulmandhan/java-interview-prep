package example1;

import java.util.Map;

public class MapHelper3 implements Runnable {

	Map<String, Integer> map;

	public MapHelper3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper3").start();
	}

	public void run() {
		map.put("three", 3);

		try {
			System.out.println("MapHelper3 Sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
