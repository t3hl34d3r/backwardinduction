package backwardinduction;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;
import org.jgrapht.demo.JGraphAdapterDemo;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.*;

public class Main {
	//public static SimpleGraph<Node,Edge> tree = new SimpleGraph<Node,Edge>(Edge.class);
	public static SimpleGraph tree = new SimpleGraph(DefaultEdge.class);
	private static JGraphModelAdapter m_jgAdapter = new JGraphModelAdapter(tree);
	
	public static void main(String[] args){

		
		
		Node egy = new Node("egy");
		Node ketto = new Node("ketto");
		Node harom = new Node("harom");
		Node negy = new Node("negy");
		
		tree.addVertex("egy");
		tree.addVertex("ketto");
		tree.addVertex("harom");
		tree.addVertex("negy");
		
		
		tree.addEdge("egy", "ketto");
		tree.addEdge("egy", "harom");
		tree.addEdge("egy", "negy");
		
        
        
        JGraphAdapterDemo applet = new JGraphAdapterDemo(  );
        applet.init(  );

        JFrame frame = new JFrame(  );
        frame.setSize(400, 400);
        JGraphModelAdapter jgraphmodeladapter = new JGraphModelAdapter(tree);
        jgraphmodeladapter.createDefaultVertexAttributes();
        JGraph jgraph = new JGraph(jgraphmodeladapter);
        frame.getContentPane().add(jgraph);
        frame.show();
        
        /*frame.getContentPane(  ).add( applet );
        frame.setTitle( "JGraphT Adapter to JGraph Demo" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack(  );
        frame.show(  );*/
		
		
	}
	
	

}
