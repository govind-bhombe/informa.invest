package invest.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidCridentials {
	
	@BeforeClass
	public void addition() {
		System.out.println("hiii everything is ok! Before Method");
	}
	
	@Test
	public void addition1() {
		System.out.println("hiii everything is ok! first");
	}
	
	@Test
	public void addition2() {
		System.out.println("hiii everything is ok! second");
	}
	
	@AfterMethod
	public void addition3() {
		System.out.println("hiii everything is ok!After Method");
	}

}
