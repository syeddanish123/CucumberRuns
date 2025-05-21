package utilities;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderss {

	
	@DataProvider(name="dp")
	public Object[][] getdata() throws Exception {
		
		ExcelUtility excelutil=new ExcelUtility(System.getProperty("user.dir")+"\\testData\\DatatrivenTestData.xlsx");
		int totalrow=excelutil.getrow("Sheet1");
		int totalcell=excelutil.getcol("Sheet1",1);
		
		Object a[][]=new Object[totalrow][totalcell];
		
	try {
			
		for(int i=1;i<=totalrow;i++)
		{
			for(int j=0;j<totalcell;j++)
			{
				
				 a[i-1][j]=excelutil.getcelldata("Sheet1",i,j);
			}
		}
	
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	return a;
	   	
	}
	
	
	
	@DataProvider(name="contactUS")
	public Object[][] getData_ContactUS() throws Exception {
		
		String path=System.getProperty("user.dir")+"//testData//Book1.xlsx";
		ExcelUtility excelutil=new ExcelUtility(path);
		int totallrow=excelutil.getrow("Sheet1");
		int totallcol=excelutil.getcol("Sheet1",1);
		
		Object arr[][]=new Object[totallrow][totallcol];
		
		try {
		
		for(int i=1;i<=totallrow;i++)
		{
			for(int j=0;j<totallcol;j++)
			{
				arr[i-1][j]=excelutil.getcelldata("Sheet1",i, j);
			}
		}		
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return arr;
	}
	
	
	
	
	
	
	
}
