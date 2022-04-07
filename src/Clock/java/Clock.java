package Clock.java;

import java.util.*;
import java.util.Date;
import java.util.Calendar;

public class Clock {
	//khai bao cac thuoc tinh gio phut giay
	private int second;
	private int minute;
	private int hour;
	
	public Clock(int h, int m, int s) {
		setTime(h,m,s);
	}
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ? h : 0);
	}
	public void setMinute(int h) {
		minute = ((h >= 0 && h < 60) ? h : 0);
	}
	public void setSecond(int h) {
		minute = ((h >= 0 && h < 60) ? h : 0);
	}
	public String toString() {
		return ((hour == 12 || hour == 0 ) ? 12: hour % 12) +
				":" + (minute < 10 ? "0" : "") + minute +
				":" + (second < 10 ? "0" : "") + second +
				( hour < 12 ? " AM" : " PM");				
	}
	public void tick() {
		setSecond( second + 1);
		if (second == 0 )
			incrementMinute();		
	}
	public void incrementMinute() {
		setMinute( minute + 1);
		if ( minute == 0 )
			incrementHour();
	}
	public void incrementHour() {
		setMinute( hour + 1);
	}
	
	public static void main(String args[]) {
		Time A;
		A = new Time(3,0,0);
		while(true) {
			System.out.println("Thoi gian lap lai la: "+ A.toString());
			try {
				Thread.sleep(1000);
				A.tick();
			}
		catch (Exception e) {
			
		}
		}
		
	}

}
