import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSeleniumTest {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.google.com");
            String pageTitle = driver.getTitle();

            System.out.println("Titlul paginii este: " + pageTitle);

            if (pageTitle != null && pageTitle.contains("Google")) {
                System.out.println("Test reușit: titlul paginii este corect.");
            } else {
                System.out.println("Test eșuat: titlul paginii nu este corect.");
            }
        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}