package snakeCharmer;

public class Snake {

	//current position of the snake
	int current_Position_x = 0;
	int current_Position_y = 0;
	
	//current direction of the snake, 0 is for north, 1 is for east, 2 is for south, 3 is for west
	int current_Direction = 0;
	
	/*
	 * L move
	 * @return int[], first element is the x position, and second element is the y position
	 */
	public int[] lMove() {
		
	}
	
	/*
	 * R move
	 * @return int[], first element is the x position, and second element is the y position
	 */
	public int[] rMove() {
		
	}
	
	/*
	 * get the position of next step if move Left
	 */
	public int[] getLMovePosition()
	{
		

	}
	
	/*
	 * get the position of next step if move Right
	 */
	public int[] getRMovePosition()
	{
		

	}
	
	public int getCurrent_Position_x() {
		return current_Position_x;
	}
	public void setCurrent_Position_x(int current_Position_x) {
		this.current_Position_x = current_Position_x;
	}
	
	public int getCurrent_Position_y() {
		return current_Position_y;
	}
	public void setCurrent_Position_y(int current_Position_y) {
		this.current_Position_y = current_Position_y;
	}

	public int getCurrent_Direction() {
		return current_Direction;
	}
	public void setCurrent_Direction(int current_Direction) {
		this.current_Direction = current_Direction;
	}
	
}
