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
	public static SimpleDirectedGraph<Node,Edge> tree = new SimpleDirectedGraph<Node,Edge>(Edge.class);
	

    public static JGraphModelAdapter jgraphmodeladapter;
	
	public static void main(String[] args){
		Node egy = new Node("egy");
		Node ketto = new Node("ketto");
		Node harom = new Node("harom");
		Node negy = new Node("negy");
		
		
		
		tree.addVertex(egy);
		tree.addVertex(ketto);
		tree.addVertex(harom);
		tree.addVertex(negy);
		
		
		tree.addEdge(egy, ketto);
		tree.addEdge(egy, harom);
		tree.addEdge(egy, negy);
		
		
		jgraphmodeladapter = new JGraphModelAdapter(tree);
		
        
        
        JGraphAdapterDemo applet = new JGraphAdapterDemo(  );
        applet.init(  );

        JFrame frame = new JFrame(  );
        frame.setSize(800, 600);
        JGraph jgraph = new JGraph(jgraphmodeladapter);
        frame.setTitle( "Backward Induction" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add(jgraph);
        frame.setVisible(true);

        System.out.println(tree.incomingEdgesOf(negy));
		
	}
	

}
