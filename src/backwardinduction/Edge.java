package backwardinduction;
import java.lang.String;

import org.jgraph.graph.DefaultEdge;


public class Edge extends DefaultEdge {
	
	public String information="";
	

	@Override
	public String toString(){
		return information;
	}
	
}
