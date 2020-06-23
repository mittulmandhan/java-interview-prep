package example1;

import java.util.Map;

public class MapHelper2 implements Runnable {

	Map<String, Integer> map;

	public MapHelper2(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper1").start();
	}

	public void run() {
		map.put("two", 2);

		try {
			System.out.println("MapHelper2 Sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
