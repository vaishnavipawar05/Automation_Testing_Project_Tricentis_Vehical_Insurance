import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Camper {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.sparkstone.co.nz/sampleapp/101/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='main-navigation']//a[@id='nav_camper']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[3]"))
				.click();
		driver.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("125");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("07/21/2024");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select/option[3]"))
				.click();
		driver.findElement(By.xpath("//label[normalize-space()='Yes']//span[@class='ideal-radio']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select/option[2]"))
				.click();
		driver.findElement(By.xpath("//input[@id='payload']")).sendKeys("125");
		driver.findElement(By.xpath("//input[@id='totalweight']")).sendKeys("125");
		driver.findElement(By.xpath("//input[@id='listprice']")).sendKeys("1250");
		driver.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("MH12QM2261");
		driver.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("125");
		driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[1]/input[1]"))
				.sendKeys("Vishwanath");
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[2]/input[1]"))
				.sendKeys("Taware");
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[3]/input[1]"))
				.sendKeys("05/23/1998");
		driver.findElement(By.xpath("//label[normalize-space()='Male']//span[@class='ideal-radio']")).click();
		driver.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Pune");
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[99]")).click();
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[7]/input[1]"))
				.sendKeys("411028");
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[8]/input[1]"))
				.sendKeys("Pune");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select/option[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[1]/span[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[11]/input[1]"))
				.sendKeys("www.sparkstone.co.nz");

		driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
		LocalDate today = LocalDate.now();

		LocalDate futureDate = today.plusDays(32);

		String futureDateString = futureDate.format(DateTimeFormatter.ofPattern("MM/dd/YYYY"));
		driver.findElement(By.xpath("//input[@id='startdate']")).sendKeys(futureDateString);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select/option[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[4]/p[1]/label[1]/span[1]"))
				.click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select/option[3]"))
				.click();
		driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
		Thread.sleep(5000);

		String price_per_year = driver.findElement(By.xpath("//span[@id='selectultimate_price']")).getText();
		String onl_claim = driver.findElement(By.xpath("//td[@data-label='Ultimate'][normalize-space()='Submit']"))
				.getText();
		String claim_discount = driver.findElement(By.xpath("//td[contains(text(),'10')]")).getText();
		String select_option = driver.findElement(By.xpath("//td[normalize-space()='Unlimited']")).getText();

		if (price_per_year.contains("1,238.00") && onl_claim.contains("Submit") && claim_discount.contains("10")
				&& select_option.contains("Unlimited")) {

			driver.findElement(By.xpath("//section[@id='pricePlans']//label[4]//span[1]")).click();
			Thread.sleep(5000);
		} else {
			System.out.println("Cannot Proceed");

		}

		driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("itsvishwa23@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7744062398");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("itsvishwa23");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//textarea[@id='Comments']")).sendKeys("Test");

		driver.findElement(By.xpath("//button[@id='sendemail']")).click();
		Thread.sleep(10000);

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File source = screenshot.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String destFile = "./SeleniumScreenshots/Screen_" + timestamp + ".png";
		FileUtils.copyFile(source, new File(destFile));
		System.out.println("Screenshot is captured: " + destFile);
		System.out.println("Screenshot is captured");
		driver.findElement(By.xpath("//button[@class='confirm']")).click();

	}

}
