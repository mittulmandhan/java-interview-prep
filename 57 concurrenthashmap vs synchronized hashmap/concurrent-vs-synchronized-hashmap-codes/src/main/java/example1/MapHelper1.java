package example1;

import java.util.Map;

public class MapHelper1 implements Runnable {

	Map<String, Integer> map;

	public MapHelper1(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper1").start();
	}

	public void run() {
		map.put("one", 1);

		try {
			System.out.println("MapHelper1 Sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
