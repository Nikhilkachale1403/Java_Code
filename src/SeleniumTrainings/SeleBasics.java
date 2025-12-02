package SeleniumTrainings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleBasics {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		if(title.equals("Googlle")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		System.out.println(title);
		driver.close();
		
	}

}
