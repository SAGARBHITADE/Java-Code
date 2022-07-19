package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screnshot1 {
	
	public void screncapture() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();
		
		TakesScreenshot tc =(TakesScreenshot)ref;
		
		File sorece=tc.getScreenshotAs(OutputType.FILE);
		File fileurl=new File(System.getProperty("user.dir")+"\\ScrenShotP\\d2.png");
		//org.openqa.selenium.io.FileHandler.copy(sorece, fileurl);
		FileHandler.copy(sorece, fileurl);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Screnshot1 ss=new Screnshot1();
		ss.screncapture();
	}

}
