package POMRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProductPagePOM {

	
	public DeleteProductPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement DeleteProduct;

	
	public WebElement getDeleteProduct() {
		return DeleteProduct;
	}
	
	
	public void deletePrdData( )
	{
		DeleteProduct.click();
	}
	
	
	
	public void searchproducttobedeleted(WebDriver driver,String valueStored)
	{
	//	driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()=' "+valueStored+" ']/../preceding-sibling::td/input")).click();
driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='" +valueStored+"']/../preceding-sibling::td/input")).click();
	}
	/*	List<WebElement> productList = driver.findElements(By.xpath("//table[@class='lvt small']/tbody//td//a[text()='"+valueStored+"']" + "/../preceding-sibling::td/input"));
		 boolean flag=false;
		 
		 for(WebElement prdName:productList)
		 {
			String actData = prdName.getText();
			if(actData.contains(valueStored))//	Markerting293.contains(iphone)
			{
				flag=true;
				break;
			}
		 }
		if(flag)
		{
			System.out.println("product data is deleted");
		}
		else
		{
			System.out.println("product data not deleted");
		} */
	
	}
	
	
	
	
	

