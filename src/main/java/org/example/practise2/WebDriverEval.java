package org.example.practise2;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class WebDriverEval {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        FluentWait<WebDriver> fluentWait = new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        fluentWait.until((Function<WebDriver, WebElement>) _ -> null);
    }
}
