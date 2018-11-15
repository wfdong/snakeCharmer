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
		getDestinationFromFile();
		int nextLMoveX = snake.getLMovePosition()[0];
		int nextLMoveY = snake.getLMovePosition()[1];
		int nextRMoveX = snake.getRMovePosition()[0];
		int nextRMoveY = snake.getRMovePosition()[1];
		
		while((nextLMoveX!=destination_x||nextLMoveY!=destination_y)&&
				(nextRMoveX!=destination_x||nextRMoveY!=destination_y)) {
			double LmoveDistance = Math.sqrt((destination_x-nextLMoveX)*(destination_x-nextLMoveX)+
				    ((destination_y-nextLMoveY)*(destination_y-nextLMoveY)));
			double RmoveDistance = Math.sqrt((destination_x-nextRMoveX)*(destination_x-nextRMoveX)+
		            ((destination_y-nextRMoveY)*(destination_y-nextRMoveY)));
			if(LmoveDistance<RmoveDistance) {
				result = result+"L";
				snake.lMove();
				nextLMoveX = snake.getLMovePosition()[0];
				nextLMoveY = snake.getLMovePosition()[1];
				nextRMoveX = snake.getRMovePosition()[0];
				nextRMoveY = snake.getRMovePosition()[1];
			}else {
				result = result+"R";
				snake.rMove();
				nextLMoveX = snake.getLMovePosition()[0];
				nextLMoveY = snake.getLMovePosition()[1];
				nextRMoveX = snake.getRMovePosition()[0];
				nextRMoveY = snake.getRMovePosition()[1];
			}
		}
		
		if((nextLMoveX==destination_x)&&(nextLMoveY==destination_y)) {
			result = result+"L";
		}else if((nextRMoveX==destination_x)&&(nextRMoveY==destination_y)) {
			result = result+"R";
		}
		
		writeResultToFile(result);
		return result;
	}
	
	
	/*
	 * get the position X,Y from input file
	 */
	public void getDestinationFromFile() {
		Properties props = new Properties();
		InputStream in = this.getClass().getResourceAsStream("../config.properties");
		try {
			props.load(in);
			in.close();
			this.inputFile = props.getProperty("inputFilePath");
			File input = new File(inputFile);
			InputStreamReader reader = new InputStreamReader(new FileInputStream(input));
			BufferedReader br = new BufferedReader(reader);
			String destinationStr = br.readLine();
			if(destinationStr==null) {
				result = "wrong input file!";
			}else {
				String[] position = destinationStr.split(" ");
				if(position.length==2) {
					destination_x = Integer.parseInt(position[0]);
					destination_y = Integer.parseInt(position[1]);
				}else {
					result = "wrong input file!";
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			result = "wrong input file!";
		}
	    
	}
	
	
	/*
	 * write result into the output file
	 */
	public void writeResultToFile(String result)
	{
		Properties props = new Properties();
		InputStream in = this.getClass().getResourceAsStream("../config.properties");
		try {
			props.load(in);
			in.close();
			this.outputFile = props.getProperty("outPutFilePath");
			File output = new File(outputFile);
			output.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(output));
			out.write(result);
			out.flush();
			out.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
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
