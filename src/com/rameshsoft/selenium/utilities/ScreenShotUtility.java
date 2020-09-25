package com.rameshsoft.selenium.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import com.rameshsoft.selenium.basePackage.BaseEngine;

public interface ScreenShotUtility 
{
	public static String screenShot() throws IOException 
    {
    	String loc = BaseEngine.getCurDir()+"\\ScreenShots\\"+BaseEngine.getTcName()+".png";
    	File file = BaseEngine.getDriver().getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(file, new File(BaseEngine.getCurDir()+"\\ScreenShots\\"+BaseEngine.getTcName()+".png"));
		return loc;
    }
	
	
	
	
	public static String screenShot(String ScreenShots) throws IOException 
    {
    	String loc = BaseEngine.getCurDir()+"\\ScreenShots\\"+BaseEngine.getTcName()+".png";
    	File file = BaseEngine.getDriver().getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(file, new File(BaseEngine.getCurDir()+"\\ScreenShots\\"+BaseEngine.getTcName()+".png"));
		return loc;
    }
	
	
}
