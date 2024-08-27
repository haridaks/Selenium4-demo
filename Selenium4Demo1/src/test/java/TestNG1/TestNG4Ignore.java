package TestNG1;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestNG4Ignore {

		
		@Test
		@Ignore
		public void demo3() {
			System.out.println("a");
		}
		
		@Test
		public void demo4() {
			System.out.println("b");
		}


	}


