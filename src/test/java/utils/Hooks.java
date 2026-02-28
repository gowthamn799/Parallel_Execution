package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Hooks {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver getDriver() {
        return driver.get();
    }
    @Before
    public void setUp() {
        // Code to initialize WebDriver, open browser, etc.
        System.out.println("Setting up the test environment...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode if needed
        // Initialize WebDriver and set it to the ThreadLocal variable
        // For example, using ChromeDriver:
        driver.set(new ChromeDriver(options));
        driver.get().manage().window().maximize();
        getDriver().navigate().to("https://www.saucedemo.com/");

    }
    @After
    public void tearDown() {
        // Code to close browser, clean up resources, etc.
        System.out.println("Tearing down the test environment...");
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove(); // Remove the WebDriver instance from ThreadLocal
        }
    }
}
