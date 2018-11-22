import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello property : " 
                + System.getProperty("Hello", "Vikrant2565")); 
		
		System.out.println(new Date());
		
		System.out.println("vikrant");
		
		Runnable r1 = new Runnable()
				{

			@Override
			public void run() {
				
			}

	};

}
}
