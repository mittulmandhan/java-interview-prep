package example2;

import java.util.Map;

public class MapHelper4 implements Runnable {

	Map<String, Integer> map;

	public MapHelper4(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper4").start();
	}

	public void run() {
		map.put("four", 4);

		try {
			System.out.println("MapHelper4 Sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
