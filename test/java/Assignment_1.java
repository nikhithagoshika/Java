import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Assignment_1 {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--guest");
        WebDriver driver = new ChromeDriver(Options);
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();

        String actual_name="Nikhitha";
        String actual_email="nikhithagoshika4@gmail.com";

        driver.findElement(By.linkText("Signup / Login")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(actual_name);
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(actual_email);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Signup' and @type='submit']")).click();
        driver.findElement(By.id("id_gender2")).click();
        String expected_name=driver.findElement(By.id("name")).getAttribute("value");
        String expected_email=driver.findElement(By.id("email")).getAttribute("value");

        if(actual_name.equals(expected_name)){
            System.out.println("Name is Matched");
        }
        else {
            System.out.println("Name is not Matched");
        }
        if(actual_email.equals(expected_email)){
            System.out.println("Email is Matched");
        }
        else {
            System.out.println("Email is not Matched");
        }
        driver.findElement(By.id("password")).sendKeys("ExTroVERT@2020");

        //Date of Birth Selection
        WebElement Day=driver.findElement(By.id("days"));
        WebElement Month=driver.findElement(By.id("months"));
        WebElement Year=driver.findElement(By.id("years"));

        Select Day_Options=new Select(Day);
        Select Month_Options=new Select(Month);
        Select Year_Options=new Select(Year);

        Day_Options.selectByValue("11");
        Month_Options.selectByValue("8");
        Year_Options.selectByValue("2000");

        Thread.sleep(5000);

        //checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Number of Checkboxes: "+checkboxes.size());
        WebElement checkBox1 = checkboxes.get(0);
        if(!checkBox1.isSelected()){
            checkBox1.click();
        }

        WebElement checkBox2 = checkboxes.get(1);
        if(!checkBox2.isSelected()){
            checkBox2.click();
        }

        //Address Information
        driver.findElement(By.id("first_name")).sendKeys("Nikhitha");
        driver.findElement(By.id("last_name")).sendKeys("Goshika");
        driver.findElement(By.id("company")).sendKeys("Capgemini");
        driver.findElement(By.id("address1")).sendKeys("Hyderabad");
        driver.findElement(By.id("address2")).sendKeys("XYZ");
        driver.findElement(By.id("state")).sendKeys("Telangana");
        driver.findElement(By.id("city")).sendKeys("Bhongir");
        driver.findElement(By.id("zipcode")).sendKeys("728372");
        driver.findElement(By.id("mobile_number")).sendKeys("7777392737");
        driver.findElement(By.xpath("//button[text()='Create Account']")).click();

        String AccountCreation=driver.findElement(By.xpath("//h2/b[text()='Account Created!']")).getText();
        System.out.println(AccountCreation);

        String CongratulationText=driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']")).getText();
        System.out.println(CongratulationText);

        driver.findElement(By.xpath("//a[text()='Continue']")).click();

        String Loggedin_User=driver.findElement(By.xpath("//a/b")).getText();
        System.out.println(Loggedin_User);
        if(actual_name.equals(Loggedin_User)){
            System.out.println("User logged in with Correct User");
        }
        else{
            System.out.println("User logged in with InCorrect User");
        }
        driver.quit();


    }
}
