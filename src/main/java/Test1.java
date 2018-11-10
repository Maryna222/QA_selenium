import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    public static void main(String[] args){
        WebDriver driver = getInitFirefoxDriver();
        //LoginPage login = new LoginPage(driver);
        //login.login("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw" );


       AdminPanel loginnew = new AdminPanel(driver);
       loginnew.loginnew("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw" );


    }

    private static WebDriver getInitFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver",Test1.class.getResource("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }
}
