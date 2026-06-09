import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
/* 1. ID
   2. Name
   3. TagName
   4. ClassName
   5. Link Text
   6. Partial Link Text
   7. XPath
   8. CSS Selector
 */
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions Options=new ChromeOptions();
        Options.addArguments("--guest");
        Options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(Options);
        /*driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        //Link Text
        driver.findElement(By.linkText("Inputs")).click();
        Thread.sleep(2000);

        String CaptureText=driver.findElement(By.tagName("h3")).getText();
        System.out.println(CaptureText);

        driver.navigate().back();

        //Partial Link Text
        driver.findElement(By.partialLinkText("Broke")).click();
        Thread.sleep(2000);

        String CaptureText2=driver.findElement(By.tagName("h3")).getText();
        System.out.println(CaptureText2);*/

        //Xpath
        /*driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement Username=driver.findElement(By.xpath("//input[@id='user-name']"));
        Username.sendKeys("standard_user");

        WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String PageTitle=driver.getTitle();
        System.out.println(PageTitle);*/

        driver.get("https://automationexercise.com/");
        //driver.findElement(By.xpath("//a[normalize-space(text())='Signup / Login']")).click();
        driver.findElement(By.xpath("//a[text()='Signup / Login']")).click();
        driver.quit();
    }
}
