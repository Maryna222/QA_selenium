import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    public void login(String login, String password) {
        this.driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.name("submitLogin")).click();
        driver.findElement(By.id("employee_infos")).click();
        driver.findElement(By.id("header_logout")).click();
        driver.quit();
    }
}
