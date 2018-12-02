package steps;

import java.net.MalformedURLException;

import action.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hookups {

	@Before(order=2)
	public void init() {
		System.out.println("I am in before>>init method");
	}
	
	@After(order=1)
	public void closer() {
		System.out.println("I am in after>>closer method");
		BaseClass bc= new BaseClass();
		bc.closeDriver();
		
		
	}
	
	
	@Before(order=1)
	public void Test1() throws MalformedURLException, InterruptedException {
		System.out.println("I am in before>>test1 method");
		BaseClass bc= new BaseClass();
		bc.createLocalDriver();
	}
	
	@After(order=2)
	public void test2() {
		System.out.println("I am in after>>test2 method");
	}
	
	
	@Before("@specialtag")
	public void special1() {
		System.out.println("I am in before>>special tag -special1 method");
	}
	
	@After("@specialtag")
	public void special2() {
		System.out.println("I am in after>>special tag -special2 method");
	}
	
	
}
