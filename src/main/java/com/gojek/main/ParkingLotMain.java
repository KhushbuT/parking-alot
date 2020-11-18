package com.gojek.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.gojek.commands.ReadCommands;

public class ParkingLotMain {

	public static void main(String[] args)  {
		System.out.println("Enter your input file name : ");
		Scanner scanInput = new Scanner(System.in);
		String fileName = scanInput.next();
		ReadCommands readCommands = new ReadCommands(fileName);
		try {
			readCommands.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("Please enter input file .txt");
		}
		scanInput.close();
		
	}
	

}
