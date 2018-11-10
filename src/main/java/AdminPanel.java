import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.lang.Thread;



public class AdminPanel {
    public AdminPanel(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    public void loginnew(String login, String password) {
        this.driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.name("submitLogin")).click();


        List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='bootstrap']/nav/ul/li"));
        int s = allElements.size();
        System.out.println("Count of <li> elements: " + s);
        for(int i=1;i<=s;i++){
            allElements = driver.findElements(By.xpath("//div[@class='bootstrap']/nav/ul/li"));
            allElements.get(i).click();
            System.out.println("Page title is: " + driver.getTitle());
            driver.navigate().refresh();

        }

        driver.quit();

    }
}
