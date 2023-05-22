package org.checkCPA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckCPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Program Files\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.cpat.com/");
		driver.findElement(By.id("menu-item-15032")).click();
		//driver.close();
		
		
		
	}

}
