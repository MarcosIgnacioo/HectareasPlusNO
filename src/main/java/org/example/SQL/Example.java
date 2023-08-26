package org.example.SQL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Example  {

    public static void main(String[] args) {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = new HtmlUnitDriver();

        // And now use this to visit Google
        driver.get("https://enlinea2023-2.uabcs.mx/my/");

        // Find the text input element by its name
        //
        WebElement user = driver.findElement(By.name("username"));

        // Enter something to search for
        user.sendKeys("marcosignc_21");

        WebElement password = driver.findElement(By.name("username"));
        password.sendKeys("sopitasprecio");
        // Now submit the form. WebDriver will find the form for us from the element
        //element.submit();
        user.submit();
        password.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
