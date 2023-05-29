package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_scripts.Pom;
import generic_files.Base_test;

public class TestScript1 extends Base_test {
	    @Test(dataProvider = "testdata")
	    public void test1(String d1, String d2) throws InterruptedException
	    {
	    	Pom p= new Pom(driver);
	    	p.passUn(d1);
	    	p.passPwd(d2);
	    	Thread.sleep(2000);
	    	p.clickBtn();
	    	Assert.fail();
	    }
	    
	    @DataProvider(name="testdata")
	    public Object[][] createData1()
	    {
	    	return new Object[][]
	    			{
	    		{"Santhosh","12345"}
	    			};
	    }
	    //hello

}
