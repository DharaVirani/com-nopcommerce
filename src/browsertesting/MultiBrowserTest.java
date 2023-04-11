package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Firefox";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

   public static void main(String[] args) {
       if(browser.equalsIgnoreCase("Chrome")){
           driver = new ChromeDriver();
       }else if (browser.equalsIgnoreCase("Firefox")) {
           driver = new FirefoxDriver();
       }else if (browser.equalsIgnoreCase("Edge")) {
           driver = new EdgeDriver();
       }else {
           System.out.println("Wrong browser name");
       }
//        To maximise the window
       driver.manage().window().maximize();
//       To Open the Url
       driver.get(baseUrl);
//       Print the title
       System.out.println("Title of the Page is: " + driver.getTitle());
//       Print the current Url
       System.out.println("Current Url is: " + driver.getCurrentUrl());
//       Print the page source
       System.out.println("The Page source is: " + driver.getPageSource());
//       Enter the email to email field
       driver.findElement(By.id("Email")).sendKeys("xyz123@gmail.com");
//       Enter the password field
       driver.findElement(By.id("Password")).sendKeys("xyz123");
//       Close the browser
       driver.close();

   }
}
