package com.cloudminds.lightningshuo;

import java.io.IOException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import android.os.RemoteException;

public class PhoneCallTesting extends UiAutomatorTestCase {
	public void testPhone() throws IOException,UiObjectNotFoundException,RemoteException
	{	
		//获取设备对象
		UiDevice mUiDevice = getUiDevice();
		mUiDevice.wakeUp();
		mUiDevice.pressHome();
		
		//启动电话应用
		Runtime.getRuntime().exec("monkey -p com.android.contacts -v 1");
		
		
		
		//实例化手机拨号按键
		UiObject num_1 = new UiObject(new UiSelector().text("1"));
		UiObject num_0 = new UiObject(new UiSelector().text("0"));
		UiObject dialPad = new UiObject(new UiSelector().text("键盘"));
		UiObject dialButton = new UiObject(new UiSelector().resourceId("com.android.contacts:id/dialButton"));
		UiObject endButton = new UiObject(new UiSelector().resourceId("com.android.incallui:id/endButton"));
		//UiObject endButton2 = new UiObject(new UiSelector().className("Button").index(2));
		
		//拨打手机数字按键并进行拨通
		mUiDevice.click(50, 50);//点击键盘
		num_1.click();
		num_0.click();
		num_0.click();
		num_1.click();
		num_0.click();
		
		
		//拨打手机
		dialButton.click();
		
		//通话时长5s
		sleep(5000);
		
		//挂断手机
		endButton.click();
		
		sleep(1000);
		mUiDevice.pressHome();	
	}

}
