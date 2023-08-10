import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Edge {
    @Test
    public void headlessEdge(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setCapability("ms:edgeOptions", "{\n" +
                "  \"headless\": true,\n" +
                "  \"args\": [ \"--disable-gpu\", \"--no-sandbox\" ]\n" +
                "}");        edgeOptions.addArguments("--headless=new");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
