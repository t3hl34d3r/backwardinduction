package backwardinduction;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.tree.TreeNode;

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
		Node egy = new Node(1);
		Node ketto = new Node(2);
		Node harom = new Node(3);
		Node negy = new Node(4);
		
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
        
        System.out.println(Boolean.toString(isLeaf(ketto)));
        
        System.out.println(getBestValueLeaf(getLeafs()));
        
        System.out.println(getParent(ketto));
        

       
		
	}
	
	public static boolean isLeaf(Node n){
		if (tree.outgoingEdgesOf(n).isEmpty())
			return true;
		return false;
	}
	
	public static Set<Node> getLeafs(){
		Set<Node> leafs = new HashSet<Node>();
		for(Iterator<Node> it = tree.vertexSet().iterator(); it.hasNext(); ){
			Node n = it.next();
			if (isLeaf(n))
				leafs.add(n);
		}
		return leafs;
			
	}
	
	public static Node getBestValueLeaf(Set<Node> leafs){
		Iterator<Node> it1 = leafs.iterator();
		double max =it1.next().getValue();
		Node best = new Node();
		for(Iterator<Node> it = leafs.iterator(); it.hasNext(); ){
			Node n = it.next();
			if(n.getValue()>=max){
				best = n;
				max=n.getValue();
			}
		}
		return best;
	}
	
	public static Node getParent(Node n){
		Node parent = tree.getEdgeSource(tree.incomingEdgesOf(n).iterator().next());		
		return parent;
	}
}
