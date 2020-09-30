import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JustTest {
    @Test
    public void TstWithJunit(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrii\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement searchField = driver.findElement(By.cssSelector("input[name='search']"));
        searchField.clear();
        searchField.sendKeys("Iphone 6");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement searchButton = driver.findElement(By.cssSelector("button[class='button button_color_green button_size_medium search-form__submit']"));
        searchButton.click();





















    }
}
