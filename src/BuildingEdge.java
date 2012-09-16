
public class BuildingEdge {
	
	
	private boolean rightEdge = false;
	private boolean leftEdge = false;
	private int xPosition = 0;
	private int yPosition = 0;
	
	
	public BuildingEdge( int anXPosition, int aYPosition)
	{
		
		//setRightEdge(isRigth);
		//setLeftEdge(isLeft);
		setxPosition(anXPosition);
		setyPosition(aYPosition);
	} //BuildingEdge
	
	
	public boolean isRightEdge() {
		return rightEdge;
	}
	public void setRightEdge(boolean rightEdge) {
		this.rightEdge = rightEdge;
	}
	public boolean isLeftEdge() {
		return leftEdge;
	}
	public void setLeftEdge(boolean leftEdge) {
		this.leftEdge = leftEdge;
	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	public String toString()
	{
		return "xPostion: " + getxPosition() + " yPosition: " + getyPosition();
	}

}
