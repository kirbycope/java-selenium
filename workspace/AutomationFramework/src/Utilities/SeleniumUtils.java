package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils {
	/**
	 * Takes a screenshot of the WebDriver's current page.
	 * @param driver
	 * @return
	 * @throws IOException
	 */
	public static String TakeScreenshot(WebDriver driver) throws IOException{
		// Get the current time
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd-HH-mm-ss-SSS");
		// Convert simpleDateFormat to string
		String timeStamp = simpleDateFormat.format(new Date());
		// Create fileName
		String fileName = "C:\\temp\\Selenium\\" + timeStamp + ".jpg";
		// Take a screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(fileName));
		// Return the fileName of the screenshot
		return fileName;
	}
}
