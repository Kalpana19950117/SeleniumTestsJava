package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args) {
        // Change path to the chromedriver executable if required.
        System.setProperty("webdriver.chrome.driver", "./chromedriver");

        // Create a new instance of ChromeDriver with maximized window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize the browser window
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.com");

        // Enter "Nikon" in the search box and submit the search
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nikon");
        searchBox.submit();
        driver.findElement(By.className("a-dropdown-prompt")).click();


        // Select "Price: High to Low" option and select the second product
        driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
        //added waiting time to load the page
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("div[data-index='2'] h2 a.a-link-normal")).click();

        // Verifying the product topic contains the text "Nikon D3X"
        WebElement productTopic = driver.findElement(By.id("productTitle"));
        String productTitle = productTopic.getText();
        //System.out.print(productTitle + "\n");
        driver.quit();
        assert productTitle.contains("Nikon D3X");
    }
}
