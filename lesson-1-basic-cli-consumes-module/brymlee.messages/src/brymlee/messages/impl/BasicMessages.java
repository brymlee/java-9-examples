package brymlee.messages.impl;

import java.util.Date;

public class BasicMessages{

	public static String getMessage(){
		final Long time = new Date().getTime();
		if(time % 2 == 0){
			return "Hello";
		}else{
			return "Hi";
		}
	}
}
