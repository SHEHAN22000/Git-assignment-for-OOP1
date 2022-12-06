public class MonitorApp {

	public static void main(String[] args) {
	
		Monitor monitor1 = new Monitor();
		monitor1.start();
		Monitor monitor2 = new Monitor();
		
		//if close
		if(monitor1.isOn)
		{
		System.out.println("Monitor1 is On");
		}
		
		if(monitor2.isOn)
		{
		System.out.println("Monitor2 is On");
		}
		
		else {
			System.out.println("Monitor2 is Off");
		}
		
	}

}