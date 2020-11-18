package com.gojek.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadCommands {

private String fileName;
	
	public ReadCommands(String fileName) {
		this.fileName = fileName;
	}

	
	public void readFile() throws IOException {
		File file = new File(fileName);
		if (file.exists()) {
			List<String> readAllLines = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
			readAllLines.forEach(line->executeCommand(line));
		} else {
			throw new FileNotFoundException("Please check your file name");
		}
		
	}


	private void executeCommand(String line) {
		// TODO Auto-generated method stub
		
	}
}
