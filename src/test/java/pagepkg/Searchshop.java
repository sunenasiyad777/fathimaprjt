package pagepkg;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchshop {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"autocomplete\"]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"search\"]/a")
	WebElement searchButton;
	@FindBy(xpath="//*[@id=\"product_list\"]/div[2]/ul/li[4]/span")  
	WebElement metal;  
	@FindBy(xpath="//*[@id=\"show_brand_fct\"]/li[2]/label")
	WebElement brand;  
	@FindBy(xpath="//*[@id=\"det_img_132825113\"]")   
	WebElement mensWatch; 
	@FindBy(xpath="//*[@id=\"add_cart\"]")
	WebElement cart; 
    @FindBy(xpath="//*[@id=\"add_cart\"]")
	WebElement scrollDown ; 
    @FindBy(xpath="/html/body/div[3]/div/div/div[4]/ul/li[4]/a")
   	WebElement view; 
    @FindBy(xpath="//*[@id=\"loadContent\"]/div[2]/div[1]/div/div/a/img")
   	WebElement logo;
    @FindBy(xpath="/html/body/div[4]/div/div/div[4]/ul/li[4]/a")
   	WebElement cart1;
    @FindBy(xpath="//*[@id=\"132825113_1139060588\"]/div[2]/div[2]/a")
  	WebElement remove;
   @FindBy(xpath="//*[@id=\"loadContent\"]/div[1]/div[2]/div[2]/a[1] ")
  	WebElement removeitem;
   @FindBy(xpath="//*[@id=\"loadContent\"]/div[2]/div[1]/div/div/a/img ")
  	WebElement logo1;
    
   
	
	
	public Searchshop(WebDriver driver) {
		this.driver=driver;             ////*[@id="search-result"]/li[3]/a
		PageFactory.initElements(driver, this);
	}
	
	public void searchClick(String productname) {
		search.click();
		search.sendKeys(productname);
	}
	public void searchIcon ( ) {
		searchButton.click();
		
	}
	public void filter ( ) throws Exception {
		Thread.sleep(3000);
		metal.click();
		
	}
	public void label( ) throws Exception {
		Thread.sleep(3000);
		brand.click();
		
	}
	public void watch( ) throws Exception {
		Thread.sleep(1000);
		mensWatch.click();
		
	}
	public void addToCart( ) throws Exception {
		Thread.sleep(1000);
	    cart.click();
		
	}
	public void viewCart( ) throws Exception {
		Thread.sleep(1000);
	    view.click();
		
	}
	public void logoClick( ) throws Exception {
		Thread.sleep(1000);
	    logo.click();
		
	}
	public void cartClick( ) throws Exception {
	Thread.sleep(1000);
	  cart1.click();
		
	}
	public void itemRemove( ) throws Exception {
		Thread.sleep(1000);
	  remove.click();
		
	}
	public void itemRemove1( ) throws Exception {
		Thread.sleep(1000);
	   removeitem.click();
		
	}
	public void logoClick1( ) throws Exception {
		Thread.sleep(1000);
	   logo1.click();
		
	}
	
}

	
	
	


