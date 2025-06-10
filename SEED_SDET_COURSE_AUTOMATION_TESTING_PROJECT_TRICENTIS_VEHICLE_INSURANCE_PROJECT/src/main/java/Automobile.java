import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.sparkstone.co.nz/sampleapp/101/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div[1]/ul/li[1]/a")).click();

		// VEHICLE DATA // START//

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[13]")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"))
				.sendKeys("300");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"))
				.sendKeys("07/18/2024");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select/option[5]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select/option[2]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/input"))
				.sendKeys("30000");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input"))
				.sendKeys("MH32AC8977");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"))
				.sendKeys("121");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/button")).click();

		// VEHICLE DATA // END //

		// Enter Insurant Data// //START//

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"))
				.sendKeys("Prabhat");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"))
				.sendKeys("Hiwrale");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"))
				.sendKeys("12/27/1998");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input"))
				.sendKeys("Karve nagar, Pune");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select")).click();

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[106]")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"))
				.sendKeys("411052");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input"))
				.sendKeys("Pune");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select/option[6]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[11]/input"))
				.sendKeys("https://www.google.com/");

		// driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[12]/div/input")).sendKeys(args)

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]"))
				.click();

		// Insurant data// END //

		/// --------- // START of Product Data -------------- ///
		// Date
		LocalDate currentDate1 = LocalDate.now();

		LocalDate futureDate = currentDate1.plusDays(32);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		String formattedFutureDate = futureDate.format(formatter1);
		// End Date

		driver.findElement(By.xpath("//*[@id=\"startdate\"]")).sendKeys(formattedFutureDate); // start date
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select")).click(); // insurance
																														// Sum
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select/option[2]"))
				.click(); // insurance Sum value
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select")).click(); // Merit
																														// Rating
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select/option[11]")).click(); // Merit
																														// Rating
																														// Value
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/select")).click(); // Damage
																														// insurance
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/select/option[4]"))
				.click(); // Damage insurance Value
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span"))
				.click(); // Optional
		// Product
		// value
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[6]/select")).click(); // Country
																														// Car
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[6]/select/option[2]"))
				.click(); // Country Car value

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[7]/button[2]"))
				.click(); // Next Page

		// --------------- End of Product Data----------- //

		// SELECT PRICE OPTION // START //

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span"))
				.click();

		String status = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[1]/td[5]/span"))
				.getText();

		System.out.println(status);
		if (status.contains("2,655.00")) {
			System.out.println("Test Passed");
		}

		else {
			System.out.println("Test Fail");
		}

		Thread.sleep(3000);

		// driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[1]/div/div[1]/div/div[1]/a/span/i")).click();
		// //SEND QUOTE BUTTON

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]"))
				.click();

		// SELECT PRICE OPTION // END //

		// ----------- START SEND QUOTE ----------------------//

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input"))
				.sendKeys("tejaskarde21@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input"))
				.sendKeys("8788799274");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[3]/input"))
				.sendKeys("Prabhat");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[4]/input"))
				.sendKeys("Pass@123");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[5]/input"))
				.sendKeys("Pass@123");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea"))
				.sendKeys("Hello");
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]")).click();
		Thread.sleep(10000);

		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("E:\\imagesSeleniumss\\ss.jpeg"));

		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
		// ----------- END SEND QUOTE ----------------------//
		// ----------------Back TO HOME ---------------------------//

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[8]/div/div[1]/div/div[1]/a/span/i"))
				.click();

	}

}
