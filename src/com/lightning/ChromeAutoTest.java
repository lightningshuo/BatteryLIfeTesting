package com.lightning;

import java.io.IOException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import android.os.RemoteException;
import android.os.SystemClock;

public class ChromeAutoTest extends UiAutomatorTestCase {

	public void testChrome() throws IOException,UiObjectNotFoundException,RemoteException {
		
		Runtime.getRuntime().exec("monkey -p com.android.chrome -v 1");
		UiDevice mUiDevice = getUiDevice();
		mUiDevice.wakeUp();
		mUiDevice.pressBack();
		
		for (int time = 600; time >=0 ; time --){
		UiObject urlText = new UiObject(new UiSelector().resourceId("com.android.chrome:id/url_bar"));
		urlText.setText("http://www.baidu.com");
		urlText.click();
		mUiDevice.click(333,540);
		SystemClock.sleep(3000);
		
		urlText.setText("http://www.sohu.com");
		urlText.click();
		mUiDevice.click(333,540);
		SystemClock.sleep(3000);
		//Game
		
//		UiDevice mUiDevice = getUiDevice();
//		mUiDevice.wakeUp();
//		
//		for(int i = 1800; i >= 0; i--){
//		mUiDevice.click(540, 333);
//		SystemClock.sleep(1000);
//		mUiDevice.click(580, 250);
//		SystemClock.sleep(1000);
		
		}
		mUiDevice.pressBack();
		

		
		
		
	
	}
	
	
}
