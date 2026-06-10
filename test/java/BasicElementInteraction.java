import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class BasicElementInteraction {
    public static void main(String[] args){
        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--guest");
        WebDriver driver=new ChromeDriver(Options);
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

        //Number of Checkboxes
        List< WebElement> Num_Checkbox =driver.findElements(By.xpath("//input"));
        System.out.println(Num_Checkbox.size());


        driver.quit();
    }
}
