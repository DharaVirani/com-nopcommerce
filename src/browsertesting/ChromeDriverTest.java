package browsertesting;
/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {
    public static void main(String[] args) {

//  Storing link in the baseUrl variable
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
//  Setup chrome browser
        WebDriver driver = new ChromeDriver();
//  Open the Url
        driver.get(baseUrl);
//  To maximise the window
        driver.manage().window().maximize();
//  Print the title of the Page
        System.out.println("Title of the page is: " + driver.getTitle());
//  Print the Current Url
        System.out.println("Current URL is: " + driver.getCurrentUrl());
//  Print the page source
        System.out.println("Page source is: " + driver.getPageSource());
//  Enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("xyz123@gmail.com");
//  Enter the password field
        driver.findElement(By.id("Password")).sendKeys("xyz123");
//  Close the browser
        driver.close();

    }
}
