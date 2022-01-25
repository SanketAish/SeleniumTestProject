package Dateprograms;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;



public class Mydatepro {
	@Test
	public void gettest() {
	Date date = new Date();
	System.out.println("printing the date:"+date);
	SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy");
	System.out.println("printing the date in this format:"+simpledateformat.format(date));
	

}
}