package section15;

import java.io.Serializable;

public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private int number;
	
	public Vehicle(String type, int number)
	{
		this.type = type;
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}
	
	
	
}
