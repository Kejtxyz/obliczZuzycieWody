import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FirstAutomatedTest {

    private WebDriver driver;
// wazne aktalny chromedriver i aktualna poprawna sciezka do pliku na kompie//
    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/selenium java/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("http://google.pl");

        driver.findElement(By.name("q")).sendKeys("JavaStart");
        driver.findElement(By.name("q")).submit();

        String pageTitle = driver.getTitle();

        assertTrue(pageTitle.contains("JavaStart"));
    }


    @Test
    public void mySecondTest() {
        driver.navigate().to("http://www.seleniumhq.org/");

        String pageTitle = driver.getTitle();

        assertTrue(pageTitle.equals("SeleniumHQ Browser Automation"));
    }
    @Test
    public void mytreeTest(){
        driver.navigate().to("http://przyklady.javastart");
        driver.findElement(By.xpath("logo"));
        driver.findElement(By.xpath("przycisk koszyka"));
        driver.findElement(By.xpath("link do storny logowania"));
        driver.findElement(By.xpath("Link do strony pomocy"));
        driver.findElement(By.xpath("POLE WYSZUKIWARKI"));
        driver.findElement(By.xpath("przyscisk search"));
        driver.findElement(By.xpath("link fish z gornego menu"));

        //**Stwórz lokatory XPath oraz CSS dla poniższych elementów ze strony http://przyklady.javastart.pl/jpetstore/actions/Catalog.action. Do tworzenia i testowania selektorów użyj zakładki Elements z panelu deweloperskiego przeglądarki Chrome.
        //Lista elementów do pokrycia:Logo w lewym górnym rogu strony głównej,
        //Przycisk koszyk,
        //Link do strony logowania,
        //Link do strony pomocy,
        //Pole wyszukiwarki,
        //Przycisk Search,
        //Link Fish z górnego menu,
        //Link Dogs z górnego menu,
        //Link Reptiles z górnego menu,
        //Link Cats z górnego menu,
        //Link Birds z górnego menu,
        //Link Fish z bocznego menu,
        //Link Dogs z bocznego menu,
        //Link Reptiles z bocznego menu,
        //Link Cats z bocznego menu,
        //Link Birds z bocznego menu,
        //Główny obraz strony,
        //Hiperłącze do strony www.mybaits.org.***//
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}