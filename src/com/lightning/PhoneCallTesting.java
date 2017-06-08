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
		//��ȡ�豸����
		UiDevice mUiDevice = getUiDevice();
		mUiDevice.wakeUp();
		mUiDevice.pressHome();
		
		//�����绰Ӧ��
		Runtime.getRuntime().exec("monkey -p com.android.contacts -v 1");
		
		
		
		//ʵ�����ֻ����Ű���
		UiObject num_1 = new UiObject(new UiSelector().text("1"));
		UiObject num_0 = new UiObject(new UiSelector().text("0"));
		UiObject dialPad = new UiObject(new UiSelector().text("����"));
		UiObject dialButton = new UiObject(new UiSelector().resourceId("com.android.contacts:id/dialButton"));
		UiObject endButton = new UiObject(new UiSelector().resourceId("com.android.incallui:id/endButton"));
		//UiObject endButton2 = new UiObject(new UiSelector().className("Button").index(2));
		
		//�����ֻ����ְ��������в�ͨ
		mUiDevice.click(50, 50);//�������
		num_1.click();
		num_0.click();
		num_0.click();
		num_1.click();
		num_0.click();
		
		
		//�����ֻ�
		dialButton.click();
		
		//ͨ��ʱ��5s
		sleep(5000);
		
		//�Ҷ��ֻ�
		endButton.click();
		
		sleep(1000);
		mUiDevice.pressHome();	
	}

}
