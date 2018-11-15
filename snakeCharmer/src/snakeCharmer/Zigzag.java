package snakeCharmer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Zigzag {

	Snake snake;
	int destination_x = 0;
	int destination_y = 0;
	
	String inputFile;
	String outputFile;
	
	String result="";
	

	/*
	 * find the shortest way
	 */
	public String zigZag()
	{
		return result;
	}
	
	/*
	 * get the position X,Y from input file
	 */
	public void getDestinationFromFile() {
		
	    
	}
	
	
	/*
	 * write result into the output file
	 */
	public void writeResultToFile(String result)
	{
		
	}
	

	public Snake getSnake() {
		return snake;
	}
	public void setSnake(Snake snake) {
		this.snake = snake;
	}
	
	public int getDestination_x() {
		return destination_x;
	}
	public void setDestination_x(int destination_x) {
		this.destination_x = destination_x;
	}
	
	public int getDestination_y() {
		return destination_y;
	}
	public void setDestination_y(int destination_y) {
		this.destination_y = destination_y;
	}
	
	public String getInputFile() {
		return inputFile;
	}
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputFile() {
		return outputFile;
	}
	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
