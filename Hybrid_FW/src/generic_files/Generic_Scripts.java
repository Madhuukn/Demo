package generic_files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Scripts {
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo="./Photos/";//declare a variable and give the path 
		Date d=new Date();//for to get date 
		String d1 = d.toString();//covert the date formate to string formate
		String d2 = d1.replace(":", "-");//using replace() replace : with -
		TakesScreenshot ts= (TakesScreenshot)driver; //to take screenshot typecaste TakesScreenshot
		File src = ts.getScreenshotAs(OutputType.FILE);//invoke the getScreenshot() and give the output type 
		//in which formate we store the photo
		File dst= new File(photo+d2+ ".jpeg");//the file include the photo +d2(date) + file (img)formate like img,jepg
		FileHandler.copy(src, dst);//copy from the scr and dst
		//screenshot store in the tempory memory scr and copy from there and paste in dst the hard disk memory

}

}
