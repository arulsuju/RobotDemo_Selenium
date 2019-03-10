import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotDemo {
    public static void main(String[] args) {

        try {
            WebDriver webDriver = new FirefoxDriver();
            webDriver.get("https://www.monsterindia.com/");

            WebElement link = webDriver.findElement(By.cssSelector("a[title='Click to upload your resume']"));
            link.click();
            WebElement select = webDriver.findElement(By.name("file"));
            /*
            select.sendKeys("F:\\resume.pdf"); //two back slash must be given for selecting the files.
            */

            //INSTEAD OF SENDKEYS WE CAN USE Robot
            select.click();
            Robot r=new Robot();//package java.awt
            r.keyPress(KeyEvent.VK_F);
            r.keyRelease(KeyEvent.VK_F);

            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_SEMICOLON);
            r.keyRelease(KeyEvent.VK_SEMICOLON);
            r.keyRelease(KeyEvent.VK_SHIFT);

            r.keyPress(KeyEvent.VK_BACK_SLASH);
            r.keyRelease(KeyEvent.VK_BACK_SLASH);

            r.keyPress(KeyEvent.VK_R);
            r.keyRelease(KeyEvent.VK_R);

            r.keyPress(KeyEvent.VK_E);
            r.keyRelease(KeyEvent.VK_E);

            r.keyPress(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_S);

            r.keyPress(KeyEvent.VK_U);
            r.keyRelease(KeyEvent.VK_U);

            r.keyPress(KeyEvent.VK_M);
            r.keyRelease(KeyEvent.VK_M);

            r.keyPress(KeyEvent.VK_E);
            r.keyRelease(KeyEvent.VK_E);

            r.keyPress(KeyEvent.VK_PERIOD);
            r.keyRelease(KeyEvent.VK_PERIOD);

            r.keyPress(KeyEvent.VK_P);
            r.keyRelease(KeyEvent.VK_P);

            r.keyPress(KeyEvent.VK_D);
            r.keyRelease(KeyEvent.VK_D);

            r.keyPress(KeyEvent.VK_F);
            r.keyRelease(KeyEvent.VK_F);
            // webDriver.close();

            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
