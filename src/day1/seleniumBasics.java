package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashvi\\OneDrive\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		//String browser= "chrome";
		WebDriver b1= new ChromeDriver();
		//if(browser== "chrome")
		//{
				
		//}
		//else if(browser=="edge")
		//{
		//	b1=new EdgeDriver();
		//}
		b1.get("http://www.google.com");
		System.out.println(b1.getTitle());
		System.out.println(b1.getCurrentUrl());
		b1.close();
	}

}
