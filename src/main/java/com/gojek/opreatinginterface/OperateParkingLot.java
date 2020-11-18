package com.gojek.opreatinginterface;

import java.util.ArrayList;
import java.util.Collections;

import com.gojek.constant.Constants;
import com.gojek.detailsofcar.MaintainDetails;

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
		MaintainDetails.mapCarWithSlot.size();
		if (this.size == 0) {
            System.out.println("Sorry, parking lot is not created");
            System.out.println();
        } else if (MaintainDetails.mapCarWithSlot.size() == this.size) {
            System.out.println("Sorry, parking lot is full");
            System.out.println();
        }else {
        	Collections.sort(availableSlotList);
            String slot = availableSlotList.get(0).toString();
            new MaintainDetails().setValue(carNumber, Constants.PARK);
            Car car = new Car(carNumber, slot);
            MaintainDetails.mapCarWithSlot.put(carNumber, slot);
            //this.map2.put(slot, slot);
    		System.out.println("Allocated slot number: " + slot);
    		availableSlotList.remove(0);
    		
    		
        }
		
		
		
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
