package com.gojek.opreatinginterface;

public class Car {

	 String regNo;
     String color;
     String slot;
     int hour;
     
    
	public Car(String regNo, String color) {
         this.regNo = regNo;
         this.color = color;
     }
     public Car(String regNo, String color,String slot) {
         this.regNo = regNo;
         this.color = color;
         this.slot=slot;
     }
     public Car(String regNo, String color,int hour) {
         this.regNo = regNo;
         this.color = color;
         this.hour=hour;
     }
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	 public String getSlot() {
			return slot;
		}
		public void setSlot(String slot) {
			this.slot = slot;
		}
		public int getHour() {
			return hour;
		}
		public void setHour(int hour) {
			this.hour = hour;
		}
}
