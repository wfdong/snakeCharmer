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
		if(this.current_Direction==0) {
			this.current_Direction = 3;
			this.current_Position_x--;
		}else if(this.current_Direction==1) {
			this.current_Direction = 0;
			this.current_Position_y++;
		}else if(this.current_Direction==2) {
			this.current_Direction = 1;
			this.current_Position_x++;
		}else if(this.current_Direction==3) {
			this.current_Direction = 2;
			this.current_Position_y--;
		}
		int[] position_after_lMove = {this.current_Position_x,this.current_Position_y};
		return position_after_lMove;
	}
	
	/*
	 * R move
	 * @return int[], first element is the x position, and second element is the y position
	 */
	public int[] rMove() {
		if(this.current_Direction==0) {
			this.current_Direction = 1;
			this.current_Position_x++;
		}else if(this.current_Direction==1) {
			this.current_Direction = 2;
			this.current_Position_y--;
		}else if(this.current_Direction==2) {
			this.current_Direction = 3;
			this.current_Position_x--;
		}else if(this.current_Direction==3) {
			this.current_Direction = 0;
			this.current_Position_y++;
		}
		int[] position_after_rMove = {this.current_Position_x,this.current_Position_y};
		return position_after_rMove;
	}
	
	/*
	 * get the position of next step if move Left
	 */
	public int[] getLMovePosition()
	{
		int nextX = current_Position_x;
		int nextY = current_Position_y;
		if(this.current_Direction==0) {
			nextX = this.current_Position_x-1;
		}else if(this.current_Direction==1) {
			nextY = this.current_Position_y+1;
		}else if(this.current_Direction==2) {
			nextX = this.current_Position_x+1;
		}else if(this.current_Direction==3) {
			nextY = this.current_Position_y-1;
		}
		int[] result = {nextX,nextY};
		return result;
	}
	
	/*
	 * get the position of next step if move Right
	 */
	public int[] getRMovePosition()
	{
		int nextX = current_Position_x;
		int nextY = current_Position_y;
		if(this.current_Direction==0) {
			nextX = this.current_Position_x+1;
		}else if(this.current_Direction==1) {
			nextY = this.current_Position_y-1;
		}else if(this.current_Direction==2) {
			nextX = this.current_Position_x-1;
		}else if(this.current_Direction==3) {
			nextY = this.current_Position_y+1;
		}
		int[] result = {nextX,nextY};
		return result;
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
