import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;
import java.util.List;

public class SwagLabs_Application {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions Options=new ChromeOptions();
        Options.addArguments("--guest");
       // Options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(Options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("Title of the Page is:" + driver.getTitle());

        //To get the Url of the Page
        String LoginPageUrl=driver.getCurrentUrl();
        System.out.println("Page Url is:"+LoginPageUrl);

        String[] users={"standard_user",
                        "locked_out_user",
                        "problem_user",
                        "performance_glitch_user",
                        "error_user",
                        "visual_user"};
        //Enhanced for loop
        for(String user:users) {
            try {
                driver.findElement(By.id("user-name")).clear();
                driver.findElement(By.id("user-name")).sendKeys(user);
                driver.findElement(By.id("password")).clear();
                driver.findElement(By.name("password")).sendKeys("secret_sauce");
                driver.findElement(By.id("login-button")).click();
                System.out.println("Attempted login with: " + user);

                //logout click

                driver.findElement(By.id("react-burger-menu-btn")).click();
                driver.findElement(By.id("logout_sidebar_link")).click();
                String AfterLogoutUrl = driver.getCurrentUrl();
                System.out.println("Page Url after logout is:" + AfterLogoutUrl);

                if (AfterLogoutUrl.equals(LoginPageUrl)) {
                    System.out.println("Logout Successful");
                } else {
                    System.out.println("Logout Unsuccessful");
                }
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // Handles cases where an element (like the logout button or username field) isn't found
                System.out.println("Element not found during execution for user: " + user + ". Error: " + e.getMessage());
            } catch (Exception e) {
                // Catches any other unexpected runtime errors so the loop doesn't crash
                System.out.println("An unexpected error occurred for user: " + user + ". Error: " + e.getMessage());
            }
        }

        /*driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        //Thread.sleep(5000);
        //System.out.println("Title of the Page after login is:" + driver.getTitle());*/

        String AppLogo=driver.findElement(By.className("app_logo")).getText();
        System.out.println(AppLogo);

        String Products=driver.findElement(By.className("title")).getText();
        System.out.println(Products);


        //To Find the Number of links in the Page
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println("Number of links are:" + link.size());
        Thread.sleep(2000);

        //To find the number of products in the page
        List<WebElement> NumberOfProducts=driver.findElements(By.className("inventory_item_name"));
        System.out.println("Product links are:"+NumberOfProducts.size());

        //Click on Menu
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);

        //All Links
        WebElement MenuItem1=driver.findElement(By.id("inventory_sidebar_link"));
        System.out.println(MenuItem1.getText());
        //About
        WebElement MenuItem2=driver.findElement(By.id("about_sidebar_link"));
        System.out.println(MenuItem2.getText());
        //Logout
        WebElement MenuItem3=driver.findElement(By.id("logout_sidebar_link"));
        System.out.println(MenuItem3.getText());
        //Reset
        WebElement MenuItem4=driver.findElement(By.id("reset_sidebar_link"));
        System.out.println(MenuItem4.getText());
        Thread.sleep(2000);

        //logout click
        MenuItem3.click();
        String URL2= driver.getCurrentUrl();
        System.out.println("URL after logout is:"+URL2);

        if(URL2.equals(LoginPageUrl)){
            System.out.println("Logout Successful");
        }else{
                System.out.println("Logout Unsuccessful");
        }
        driver.quit();

    }
}
