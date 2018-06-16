import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FirstHomework {
    private final String MAIN_PAGE = "http://rus.delfi.lv/";
    private final String ARTICLE = "Завод за 1 лат. Экономист Эдмунд Крастиньш готовит книгу о том, как делили промышленность Латвии в 1990-х";
    private final By NAZVANIE = By.xpath(".//a[@class='top2012-title']");


    @Test
    public void delfiLV() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Kristine.ivanova/Downloads/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(MAIN_PAGE);


        List<WebElement> mainArticle = new ArrayList<WebElement>();
        mainArticle = driver.findElements(NAZVANIE);

        boolean isArticleFound = false;
        for (int i = 0; i < mainArticle.size(); i++) {
            if (mainArticle.get(i).getText().equals(ARTICLE)) {
                isArticleFound = true;
                break;
            }
        }

        Assert.assertTrue("No Article Found", isArticleFound);
    }


}

