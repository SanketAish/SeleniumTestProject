package DataProvider;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvidermy {

	
	@DataProvider
	
	Object[][] getData(){
		
		Object[][] data= new Object[3][2];
		//1st row
		data[0][0]="admin";
		data[0][1]="admin";
		
		//2nd row
		data[1][0]=" ";
		data[1][1]=" ";
		
		//3rd row
		data[2][0]="gestuser0";
		data[2][1]="newuser";
		
	    return data;}
		
		@Test(dataProvider="getData")
		public void setData(String Username, String Password) {
			System.out.println("printing the username:"+Username);
			System.out.println("Printing the Password: "+Password);
		}}
			


			
			
