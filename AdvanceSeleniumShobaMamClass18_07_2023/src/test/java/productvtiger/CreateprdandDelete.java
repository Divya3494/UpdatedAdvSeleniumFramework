package productvtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import POMRepository.CreateProductPOM;
import POMRepository.DeleteProductPagePOM;
import POMRepository.HomePagePOM;

public class CreateprdandDelete extends BaseClass {
		@Test
		public void createprdandDelete() throws IOException, EncryptedDocumentException, InvalidFormatException, Throwable {
			
			
			File_Utility flib=new File_Utility();
			String URL = flib.getKeyAndValue("url1");
			driver.get(URL);
			
			HomePagePOM homepage=new HomePagePOM(driver);
			homepage.Productlink();
			
			CreateProductPOM createproduct=new CreateProductPOM(driver);
			createproduct.productplus();
			
			Java_Utility jlib=new Java_Utility();
			int ranNum = jlib.getRandom();
			Excel_Utility elib=new Excel_Utility();
			String valueStored = elib.getExcelData("Products", 0, 0)+ranNum;
			
			createproduct.productname(valueStored);
			
			createproduct.productsave();
			
			homepage.Productlink();
			
			DeleteProductPagePOM deleteproduct=new DeleteProductPagePOM(driver);
			deleteproduct.searchproducttobedeleted(driver, valueStored);
			Thread.sleep(3000);
			deleteproduct.deletePrdData();
			Alert a=driver.switchTo().alert();
			String asa = driver.switchTo().alert().getText();
			System.out.println(asa);
			a.accept();
			}

}

//table[@class='lvt small']/tbody/tr//td//a[text()=' Product00505938988']/../preceding-sibling::td/input"
