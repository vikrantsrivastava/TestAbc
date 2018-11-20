import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello property : " 
                + System.getProperty("Hello", "Geeks")); 
		
		System.out.println(new Date());
		
		Runnable r1 = new Runnable()
				{

			@Override
			public void run() {
				
			}

	};

}
}