package testpkg;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import basepkg.Basecls;
import pagepkg.Searchshop;
public class Testshop  extends Basecls{
  @Test
public void test() throws Exception {
	  
	   Searchshop sh=new Searchshop(driver);
	
	   sh.searchClick("watches");
	   sh.searchIcon();
	   sh.filter();
	   sh.label();
	   String parentWindow=driver.getWindowHandle();
       sh.watch();
       Set<String> allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				  JavascriptExecutor js=(JavascriptExecutor)driver;
				    js.executeScript("window.scrollBy(0,document.body.scrollDown)");
				    driver.findElement(By.xpath("//*[@id=\"add_cart\"]")).click();
				    
				    sh.addToCart();
				    sh.viewCart();
				    String parentWindow1=driver.getWindowHandle();   
				     sh.logoClick();
				     Set<String> allWindowHandles1=driver.getWindowHandles();
						for(String handle1:allWindowHandles)
						{
							if(!handle.equalsIgnoreCase(parentWindow))
							{
								driver.switchTo().window(handle);
							}
						}
						sh.cartClick();
						sh.itemRemove();
							sh.itemRemove1();
						sh.logoClick1();
					
			}
	   
	   
	
	    
  }
	   
	    
  } 
		} 
  

