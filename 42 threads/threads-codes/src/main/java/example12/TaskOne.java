package example12;

import java.util.Date;

public class TaskOne implements Runnable {

	@Override
	public void run() {
		System.out.println(new Date());
	}

}
