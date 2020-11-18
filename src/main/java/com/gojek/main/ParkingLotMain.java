package com.gojek.main;

import java.io.IOException;
import java.util.Scanner;

import com.gojek.commands.ReadCommands;

public class ParkingLotMain {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your input file name : ");
		Scanner scanInput = new Scanner(System.in);
		String fileName = scanInput.next();
		ReadCommands readCommands = new ReadCommands(fileName);
		readCommands.readFile();
		scanInput.close();
		
	}
	

}
