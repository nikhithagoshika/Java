import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WebTables {
    public static void main(String[] args){
        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--guest");
        WebDriver driver=new ChromeDriver(Options);
        driver.navigate().to("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        //Row Count
        int row_count=driver.findElements(By.xpath("//table/tbody/tr")).size();
        System.out.println("Row count is: "+row_count);
        //Column Count
        int col_count=driver.findElements(By.xpath("//table/thead//th")).size();
        System.out.println("Column count is: "+col_count);

        //Static data Capture
        //Get the Salary of Cantrell
        String Salary=driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]")).getText();
        System.out.println("Salary of Cantrell is: "+Salary);

        String Department=driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]")).getText();
        System.out.println("Department of Kierra is: "+Department);

        //Get column names from table
        List<WebElement> Col_Names=driver.findElements(By.xpath("//table/thead//th"));
        for(WebElement Col_Name:Col_Names){
            System.out.println(Col_Name.getText());
        }

        //get the position of Last name and email in the WebTable
        int Lastname_pos=0;
        int Email_pos=0;
        int Salary_pos=0;

        for(int index_pos=0;index_pos< col_count;index_pos++) {
            if (Col_Names.get(index_pos).getText().equalsIgnoreCase("Last name"))
            {
                Lastname_pos = index_pos + 1;
            }
        }


        for(int index_pos=0;index_pos< col_count;index_pos++){
            if(Col_Names.get(index_pos).getText().equalsIgnoreCase("Email")){
                Email_pos=index_pos+1;
            }
        }
        for(int index_pos=0;index_pos< col_count;index_pos++){
            if(Col_Names.get(index_pos).getText().equalsIgnoreCase("Salary")){
                Salary_pos=index_pos+1;
            }
        }

        System.out.println("Last Name position is:"+Lastname_pos);
        System.out.println("Email Position is: "+Email_pos);
        System.out.println("Salary Position is:"+Salary_pos);

        //Get Email vs salary

        for(int row=1;row<=row_count;row++){
            String Email=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+Email_pos+"]")).getText();
            if(Email.equalsIgnoreCase("kierra@example.com")){
                String Salary_Amount=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+Salary_pos+"]")).getText();
                System.out.println(Salary_Amount);
            }
        }

        driver.quit();



    }
}
