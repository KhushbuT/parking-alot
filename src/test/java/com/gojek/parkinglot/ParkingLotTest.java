package com.gojek.parkinglot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.gojek.opreatinginterface.OperateParkingLot;


public class ParkingLotTest {
	
	OperateParkingLot operatingParkingLot = new OperateParkingLot();
	
	 private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    @Before
	    public void setUpStreams() {
	        System.setOut(new PrintStream(outContent));
	    }

	    @After
	    public void cleanUpStreams() {
	        System.setOut(null);
	    }
	
	    @Test
	    public void createParkingLot() throws Exception {
	    	operatingParkingLot.createParkingLot(6);
	        assertEquals(6, operatingParkingLot.size);
	        assertEquals(6, operatingParkingLot.availableSlotList.size());
	        assertTrue("createdparkinglotwith6slots".equalsIgnoreCase(outContent.toString().trim().replace(" ", "")));
	    }
}
