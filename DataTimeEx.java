package com.rps.citi.java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeEx {

	public static void main(String[] args) {
		
		
		Year lyear=Year.of(Integer.parseInt(args[0]));
		if(lyear.isLeap())
		{
			System.out.println("its leap year...."+lyear);
		}
		else
		{
			System.out.println("not leap year..."+lyear);
		}
		
		
		
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
//		System.out.println(date.plusDays(2));
//		System.out.println(date.minusYears(2));
//		System.out.println(date);//imuttable
//		
//		LocalTime time=LocalTime.now();
//		System.out.println(time.getHour());
//		
//		
//		LocalDateTime dateTime=LocalDateTime.now();
//		
//		System.out.println(dateTime);
//		
//		LocalDateTime dateTime1=LocalDateTime.of(1993,8,10,10,45);
//		System.out.println(dateTime1);
		
		LocalDate date=LocalDate.now();//systemdate
		LocalDate bDate=LocalDate.of(1993,11,10);
	
		Period p=Period.between(bDate,date);
		System.out.printf("ur age %d years,%d months,%d days",p.getYears(),p.getMonths(),p.getDays());
		System.out.println();
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId zone1=ZoneId.of("America/New_York");
		ZonedDateTime zt=ZonedDateTime.now(zone1);
		System.out.println(zt);//Asia/Calcutta
		
		LocalDate ld=LocalDate.parse("2019-08-10");
		String s=ld.format(DateTimeFormatter.ISO_DATE);
		System.out.println(s);
		System.out.println(ld);
	}

}
