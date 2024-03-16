package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Providers {
	
	@Test(dataProvider="data")
	public void bookTicketTest(String from,String to)
	{
		System.out.println("From:"+from+" "+"To:"+to);
	}
	@DataProvider
	public Object[][]data()
	{
		Object[][]obj =new Object[3][2];
		obj[0][0]="Hyd";
	    obj[0][1]="Banglaore";
	  obj[1][0]="Hyd";
	  obj[1][1]="Kochi";
	  obj[2][0]="Hyd";
	  obj[2][1]="Delhi";
	  return obj;	
	}
}

