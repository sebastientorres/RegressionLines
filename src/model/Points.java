package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Points{
	
	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = 9132144122394996279L;
	
	private Integer x, y;
	
	public Points(){
		this.x = new Random().nextInt();
		this.y = new Random().nextInt();
	}
	
	public Integer getX() {
		return x;
	}
	
	public Integer getY() {
		return y;
	}


}
