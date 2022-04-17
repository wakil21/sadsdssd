package com.wk.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("/service")
public class WishMessageServiceImpl implements WishMessageService {

	@Override
	public String generateWishMsg() {

		LocalDateTime dt=LocalDateTime.now();
		int hour=dt.getHour();
		if(hour<12)
			return "Good morning "+hour;
		else if (hour<=14) {
			return "Good Afternoon";
		}
		else if(hour <=20)
			return "Good Evening";
		else
			return "Good Night";
			
		
		
	}

}
