package TestNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(invocationCount=5)
	
	public void demo1() {
		
		System.out.println("a");
	}
	
	@Test(enabled=false)
	
	public void demo() {
		
		System.out.println("b");
	}
	
	@Test
	
	public void demo3() {
		Assert.assertFalse(10>20);
	}

	@Test(dependsOnMethods="demo3")
	
	public void demo2(){
		System.out.println("c");
		
	}
}
