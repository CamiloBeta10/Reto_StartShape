package co.com.prueba.certificacion.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class MyChromeDriver {
    private static WebDriver driver;

    public static MyChromeDriver web(){
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver");

        String rutaDesrgaArchivoDefecto = "${user.dir}\\src\\test\\resources\\archivos";
        HashMap<String, Object> chromePreferencias = new HashMap<String, Object>();
        chromePreferencias.put("download.default_directory", rutaDesrgaArchivoDefecto);


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs",chromePreferencias);
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-print-preview");
        driver=new ChromeDriver(chromeOptions);
        return new MyChromeDriver();
    }
    public WebDriver enLaPagina(String url) {
        driver.get(url);
        return driver;
    }
}
