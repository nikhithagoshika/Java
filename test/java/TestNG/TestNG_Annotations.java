package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Annotations {
    @BeforeSuite
    public void Start(){
        System.out.println("Started");
    }
    @BeforeClass
    public void Process(){
        System.out.println("Processing");
    }
    @Test
    public void Run()
    {
        System.out.println("Running");
    }
    @Test
    public void play()
    {
        System.out.println("Playing");
    }
}
