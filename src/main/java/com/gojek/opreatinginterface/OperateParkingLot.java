package com.gojek.opreatinginterface;

import java.util.ArrayList;

public class OperateParkingLot implements OperateInterface{

	private static Integer size=0;

	// Available slots list
   static ArrayList<Integer> availableSlotList;
    
	
	@Override
	public void createParkingLot(int capacity) {
		
		OperateParkingLot.size = capacity;
		this.availableSlotList = new ArrayList<Integer>();
        for (int i=1; i<= this.size; i++) {
            availableSlotList.add(i);
        }
        System.out.println("Created parking lot with " + capacity + " slots");
        System.out.println();
		
	}

	@Override
	public void parkCar(String carNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leaveCar(String carNumber, int hours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		
	}

}
