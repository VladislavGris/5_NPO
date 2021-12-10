import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "G:\\5_Sem\\НПО\\LW10_1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds());
        try {
            driver.get("https://www.google.com/search?q=itechart");
            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));

            System.out.println(firstResult.getAttribute("textContent"));
            System.out.println(driver.getTitle());
        } finally {
            driver.quit();
        }
    }
}
