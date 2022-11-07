package laboratorio8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PrimeraPrueba {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Diego Hernandez\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.amazon.com");
	    //inserta tu código aquí
	    WebElement buscar = driver.findElement(By.id("twotabsearchtextbox"));
	    buscar.sendKeys("Call Of Duty Modern Warfare 2");
	    buscar.submit();
	    Thread.sleep(5000);
	    driver.quit();
	}
}
