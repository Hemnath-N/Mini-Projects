package com.appdeveloperblog.app.ws.io.security;

import com.appdeveloperblog.app.ws.SpringApplicationContext;

public class SecurityConstants {
	
	public static final long EXPIRATION_TIME = 864000000; // 10 Days
	public static final String TOKER_PREFIX = "Bearer";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users";
	
	public static String getTokenSecret() {
		AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
		return appProperties.getTokenSecret();
	}

}
