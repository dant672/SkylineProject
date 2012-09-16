
public class Building {

	/**
	 * @param args
	 */
	private int startPoint = 0;
	private int length = 0;
	private int height = 0;
	
	
	public Building(int aLength, int aHeight, int aStartPoint)
	{
		setStartPoint(aStartPoint);
		setLength(aLength);
		setHeight(aHeight);
		
	} // public Building
	
	public int getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	} 
	
	public String toString()
	{
		return "Start Point: " + getStartPoint() +  " Height: " + getHeight() + " Length: " + getLength(); 
	} //toString
}
