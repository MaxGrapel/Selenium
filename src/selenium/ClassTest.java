package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import java.time.Duration;
import java.util.List;

public class ClassTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.netogreen.co.il/Calculators/Nutrition-Calories.aspx");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id(("searchTxt"))).sendKeys("לחם");
        driver.findElement(By.xpath("//*[@id=\"Button1\"]")).click();



        String x =driver.findElement(By.xpath("//*[@id=\"serachResults\"]/option[1]")).getText();
        String y ="לחם לבן";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if (x==y){
            System.out.println("the text is equals");
        }else System.out.println("the text is not equals");

        System.out.println(x);



        }



        }

