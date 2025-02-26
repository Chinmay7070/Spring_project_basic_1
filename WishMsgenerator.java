package com.nt.beans;

import java.util.Date;

public class WishMsgenerator {
	
	 private Date date;
	 
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public String generateWishMsg(String user)
	{
		int hour = date.getHours();
		
		if(hour<12)
			return "good morning :"+user;
		else if(hour < 16)
			return "good afternoon : "+user;
		else if(hour < 20)
			return "good evening :"+user;
		else
			return "good night :"+user;
	}
	 

}
