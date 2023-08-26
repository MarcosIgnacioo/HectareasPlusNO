package org.example.SQL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLoginExample {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers2/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open Twitter's login page
        driver.get("https://twitter.com/login");

        // Find the username and password input fields and enter your credentials
        WebElement usernameField = driver.findElement(By.name("session[username_or_email]"));
        usernameField.sendKeys("pikmincuatro");

        WebElement passwordField = driver.findElement(By.name("session[password]"));
        passwordField.sendKeys("magmaaqua1415");

        // Find and click the login button
        WebElement loginButton = driver.findElement(By.xpath("//div[@data-testid='LoginForm_Login_Button']"));
        loginButton.click();

        // Wait for a moment to see if the login is successful (you might need to implement a better wait strategy)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}

