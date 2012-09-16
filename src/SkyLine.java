import java.util.Vector;


public class SkyLine {
	
	
		private Vector skyLinePointVector = new Vector();

		public Vector getSkyLinePointVector() {
			return skyLinePointVector;
		}

		public void setSkyLinePointVector(Vector skyLinePointVector) {
			this.skyLinePointVector = skyLinePointVector;
		}

		public void addPoint(BuildingEdge anEdge)
		{
			skyLinePointVector.add(anEdge);
			
		}
		
}
