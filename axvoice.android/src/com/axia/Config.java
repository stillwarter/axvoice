package com.axia;

import android.app.Activity;


public class Config {
	//Upload url
	public static String uploadUrl = "http://dashengine.com/upload_voice";
	//local cache file path 
	public static String cacheAudioPath = UtilFunctions.getSDPath() + "cacheAudio/";
	//application context
	public static Activity currentActivity = null;
}

