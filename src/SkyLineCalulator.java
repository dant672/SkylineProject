import java.util.Vector;


public class SkyLineCalulator {
	
	static String fileName = "/Users/skyy/codeTest/input.txt" ;
	
	
	public static void main(String[] args) {
		

	
		Building[] aBuildingArray = getBuildingList();
		findSkyLine(aBuildingArray);
		
		
		
	} //main
	
	
	private static void findSkyLine(Building[] aBuildingArray)
	{
		Vector activeBuildingVector = new Vector();
		SkyLine aSkyLine = new SkyLine();
	
      aSkyLine.addPoint(new BuildingEdge(0,0));		
	  
      
      BuildingEdge[] rightBuildingEdge = new BuildingEdge[aBuildingArray.length];
	  BuildingEdge[] leftBuildingEdge = new BuildingEdge[aBuildingArray.length];
	  
	  for(int i = 0; i < aBuildingArray.length; i++)
	  {
		  leftBuildingEdge[i] = new BuildingEdge(aBuildingArray[i].getStartPoint(), aBuildingArray[i].getHeight());
		  rightBuildingEdge[i] = new BuildingEdge( aBuildingArray[i].getLength() + aBuildingArray[i].getStartPoint(), 
				  									aBuildingArray[i].getHeight());
		  
	  } //for i 
		
	 
	  
	  
		
	}// findSkyline
	
	
	
	private static Building[] getBuildingList()
	{
		int elementCount =  6;
		Building[] aBuildingArray = new Building[elementCount];
	 
      //ad file io to read file
		
	 aBuildingArray[4] = new Building(3,9,17);
	 aBuildingArray[3] = new Building(5,9,9);
	 aBuildingArray[2] = new Building(12,4,8);
	 aBuildingArray[1] = new Building(3,11,3);
	 aBuildingArray[0] = new Building(10,7,1);
	 aBuildingArray[5] = new Building(2,3,19); 
	 
	 return aBuildingArray;
	} //getBuildingList
}
