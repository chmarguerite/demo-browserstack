package fr.dawan.formation.selenium.demo;

import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConnexionTest {
	 public static final String USERNAME = "claudehenrimargu2";
    public static final String AUTOMATE_KEY = "9ppFDpvEphV7BGRCwCLd";
    public static final String url = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void connexionAvecIdentifiantsValides() throws InterruptedException, MalformedURLException {
		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--disable-extensions");
        options.addArguments("start-maximized");
        options.setCapability("remoteFiles","true");
        DesiredCapabilities caps = new DesiredCapabilities(options);
      
       // caps.setBrowserName("chrome");
        URL u = new URL(url);
        RemoteWebDriver driver = new RemoteWebDriver(u, caps);
        driver.get("http://google.fr");
        Thread.sleep(5000);
        driver.close();
        driver.quit();

    }
}
