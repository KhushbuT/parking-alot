package com.gojek.opreatinginterface;

public interface OperateInterface {
	
	public void createParkingLot(int capacity);

	public void parkCar(String carNumber);

	public void leaveCar(String carNumber, int hours);

	public void status();

}
