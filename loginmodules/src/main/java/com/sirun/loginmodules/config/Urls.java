package com.sirun.loginmodules.config;

import android.widget.Switch;

/**
 * 服务器地址存储地方
 */
public class Urls {

	public static String WEB_ULR = "";

	/**
	 * 域名选择 0为v1 1为v2 2为v3
	 * @param i
	 */
	public static void switchUrl(int i){

		switch(i){
			case 0:
				WEB_ULR = "http://49.4.123.54:7107/";
				break;
			case 1:
				WEB_ULR = "http://49.4.123.54:7107/";
				break;
			case 2:
				WEB_ULR = "http://49.4.123.54:7109/";
				break;
		}

	}



}
