package snakeCharmer;

public class SnakeCharmerTest {

	public static void main(String[] args) {
		Snake snake = new Snake();
		SnakeCharmerTest test = new SnakeCharmerTest();
		Zigzag zigzag = new Zigzag();
		zigzag.setSnake(snake);
		
		test.snakeTest_LMove(snake);
		test.snakeTest_RMove(snake);
		test.snakeTest_GetLMovePosition(snake);
		test.snakeTest_GetRMovePosition(snake);
		test.zigzagTest_GetDestinationFromFile(zigzag);
		test.zigzagTest_writeResultToFile(zigzag);
		test.zigzagTest_zigzag(zigzag);
	}
	
	/*
	 * test for snake, LMove
	 */
	public void snakeTest_LMove(Snake snake) {
		snake.setCurrent_Direction(0);
		snake.setCurrent_Position_x(0);
		snake.setCurrent_Position_y(0);
		snake.lMove();
		assert(snake.getCurrent_Direction() == 3) : "snakeTest_LMove: direction test failed!";
		assert(snake.getCurrent_Position_x() == -1) : "snakeTest_LMove: destination x test failed!";
		assert(snake.getCurrent_Position_y() == 0) : "snakeTest_LMove: destination y test failed!";
		
		snake.lMove();
		assert(snake.getCurrent_Direction() == 2) : "snakeTest_LMove: direction test failed!";
		assert(snake.getCurrent_Position_x() == -1) : "snakeTest_LMove: destination x test failed!";
		assert(snake.getCurrent_Position_y() == -1) : "snakeTest_LMove: destination y test failed!";
	}
	
	/*
	 * test for snake, RMove
	 */
	public void snakeTest_RMove(Snake snake) {
		snake.setCurrent_Direction(0);
		snake.setCurrent_Position_x(0);
		snake.setCurrent_Position_y(0);
		snake.rMove();
		assert(snake.getCurrent_Direction() == 1) : "snakeTest_RMove: direction test failed!";
		assert(snake.getCurrent_Position_x() == 1) : "snakeTest_RMove: destination x test failed!";
		assert(snake.getCurrent_Position_y() == 0) : "snakeTest_RMove: destination y test failed!";
		
		snake.rMove();
		assert(snake.getCurrent_Direction() == 2) : "snakeTest_RMove: direction test failed!";
		assert(snake.getCurrent_Position_x() == 1) : "snakeTest_RMove: destination x test failed!";
		assert(snake.getCurrent_Position_y() == -1) : "snakeTest_RMove: destination y test failed!";
	}
	
	/*
	 * test for snake, getLMovePosition
	 */
	public void snakeTest_GetLMovePosition(Snake snake) {
		snake.setCurrent_Direction(0);
		snake.setCurrent_Position_x(0);
		snake.setCurrent_Position_y(0);
		assert(snake.getCurrent_Direction()==0) : "snakeTest_GetLMovePosition: direction test failed!";
		assert(snake.getLMovePosition()[0]==-1) : "snakeTest_GetLMovePosition: destinatioin x test failed";
		assert(snake.getLMovePosition()[1]==0) : "snakeTest_GetLMovePosition: destination y test failed";
	}
	
	/*
	 * test for snake, getRMovePosition
	 */
	public void snakeTest_GetRMovePosition(Snake snake) {
		snake.setCurrent_Direction(0);
		snake.setCurrent_Position_x(0);
		snake.setCurrent_Position_y(0);
		assert(snake.getCurrent_Direction()==0) : "snakeTest_GetRMovePosition: direction test failed!";
		assert(snake.getRMovePosition()[0]==1) : "snakeTest_GetRMovePosition: destinatioin x test failed";
		assert(snake.getRMovePosition()[1]==0) : "snakeTest_GetRMovePosition: destination y test failed";
	}
	
	/*
	 * test for zigzag, getDestinationFromFile
	 */
	public void zigzagTest_GetDestinationFromFile(Zigzag zigzag) {
		zigzag.setInputFile(null);
		zigzag.getDestinationFromFile();
		assert(zigzag.getInputFile()!=null) : "zigzagTest_GetDestinationFromFile: getDestinationFromFile test failed!";
	}
	
	/*
	 * test for zigzag, writeResultToFile
	 */
	public void zigzagTest_writeResultToFile(Zigzag zigzag) {
		zigzag.setOutputFile(null);
		zigzag.writeResultToFile("test Result:LRLR");
		assert(zigzag.getOutputFile()!=null) : "zigzagTest_writeResultToFile: writeResultToFile test failed!";
	}
	
	/*
	 * test for zigzag, zigZag
	 */
	public void zigzagTest_zigzag(Zigzag zigzag) {
		zigzag.zigZag();
		assert(zigzag.getResult().equals("LRRLL")) : "zigzagTest_zigzag: zigzag test failed!";
	}
}
