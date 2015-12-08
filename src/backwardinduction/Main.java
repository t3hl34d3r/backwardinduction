package backwardinduction;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.tree.TreeNode;

import org.jgraph.JGraph;
import org.jgraph.graph.AttributeMap;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;
import org.jgrapht.demo.JGraphAdapterDemo;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.*;

public class Main {
	public static SimpleDirectedGraph<Node,Edge> tree = new SimpleDirectedGraph<Node,Edge>(Edge.class);
	

    public static JGraphModelAdapter jgraphmodeladapter;
    
    
	
	public static void main(String[] args){
		/*Node egy = new Node(1);
		Node ketto = new Node(2);
		Node harom = new Node(3);
		Node negy = new Node(4);
		
		tree.addVertex(egy);
		tree.addVertex(ketto);
		tree.addVertex(harom);
		tree.addVertex(negy);		
		
		tree.addEdge(egy, ketto);
		tree.addEdge(egy, harom);
		tree.addEdge(egy, negy);		*/
		
		double p = 10;
		double b = -3;
		
		Node a = new Node("a");
		tree.addVertex(a);
		
		Node b1 = new Node("b1");
		tree.addVertex(b1);
		Node b2 = new Node("b2");
		tree.addVertex(b2);
		
		Node c1 = new Node("c1");
		tree.addVertex(c1);
		Node c2 = new Node("c2");
		tree.addVertex(c2);
		Node c3 = new Node("c3");
		tree.addVertex(c3);
		Node c4 = new Node("c4");
		tree.addVertex(c4);
		
		Node d1 = new Node("d1");
		tree.addVertex(d1);
		Node d2 = new Node("d2");
		tree.addVertex(d2);
		Node d3 = new Node("d3");
		tree.addVertex(d3);
		Node d4 = new Node("d4");
		tree.addVertex(d4);
		Node d5 = new Node("d5");
		tree.addVertex(d5);
		Node d6 = new Node("d6");
		tree.addVertex(d6);
		Node d7 = new Node("d7");
		tree.addVertex(d7);
		Node d8 = new Node("d8");
		tree.addVertex(d8);
		
		Node e1 = new Node("e1");
		tree.addVertex(e1);
		double[] e1outcome = {0,0,0,0};
		e1.setOutcome(e1outcome);
		
		Node e2 = new Node("e2");	
		tree.addVertex(e2);
		double[] e2outcome = {0,0,0,b};
		e2.setOutcome(e2outcome);
		
		Node e3 = new Node("e3");
		tree.addVertex(e3);
		double[] e3outcome = {0,0,b,0};
		e3.setOutcome(e3outcome);
		
		Node e4 = new Node("e4");
		tree.addVertex(e4);
		double[] e4outcome = {0,0,b,b};
		e4.setOutcome(e4outcome);
		
		Node e5 = new Node("e5");
		tree.addVertex(e5);
		double[] e5outcome = {0,b,0,0};
		e5.setOutcome(e5outcome);
		
		Node e6 = new Node("e6");
		tree.addVertex(e6);
		double[] e6outcome = {0,b,0,b};
		e6.setOutcome(e6outcome);
		
		Node e7 = new Node("e7");
		tree.addVertex(e7);
		double[] e7outcome = {0,b,b,0};
		e7.setOutcome(e7outcome);
		
		Node e8 = new Node("e8");
		tree.addVertex(e8);
		double[] e8outcome = {p,p+b,p+b,p+b};
		e8.setOutcome(e8outcome);
		
		Node e9 = new Node("e9");
		tree.addVertex(e9);
		double[] e9outcome = {b,0,0,0};
		e9.setOutcome(e9outcome);
		
		Node e10 = new Node("e10");
		tree.addVertex(e10);
		double[] e10outcome = {b,0,0,b};
		e10.setOutcome(e10outcome);
		
		Node e11 = new Node("e11");
		tree.addVertex(e11);
		double[] e11outcome = {b,0,b,0};
		e11.setOutcome(e11outcome);
		
		Node e12 = new Node("e12");
		tree.addVertex(e12);
		double[] e12outcome = {p+b,p,p+b,p+b};
		e12.setOutcome(e12outcome);
		
		Node e13 = new Node("e13");
		tree.addVertex(e13);
		double[] e13outcome = {b,b,0,0};
		e13.setOutcome(e13outcome);
		
		Node e14 = new Node("e14");
		tree.addVertex(e14);
		double[] e14outcome = {p+b,p+b,p,p+b};
		e14.setOutcome(e14outcome);
		
		Node e15 = new Node("e15");
		tree.addVertex(e15);
		double[] e15outcome = {p+b,p+b,p+b,p};
		e15.setOutcome(e15outcome);
		
		Node e16 = new Node("e16");
		tree.addVertex(e16);
		double[] e16outcome = {p+b,p+b,p+b,p+b};
		e16.setOutcome(e16outcome);
		
		tree.addEdge(a, b1);
		tree.addEdge(a, b2);
		
		tree.addEdge(b1,c1);
		tree.addEdge(b1, c2);
		tree.addEdge(b2, c3);
		tree.addEdge(b2,c4);
		
		tree.addEdge(c1,d1);
		tree.addEdge(c1, d2);
		tree.addEdge(c2, d3);
		tree.addEdge(c2, d4);
		tree.addEdge(c3, d5);
		tree.addEdge(c3, d6);
		tree.addEdge(c4, d7);
		tree.addEdge(c4, d8);
		
		tree.addEdge(d1, e1);
		tree.addEdge(d1, e2);
		tree.addEdge(d2, e3);
		tree.addEdge(d2, e4);
		tree.addEdge(d3, e5);
		tree.addEdge(d3, e6);
		tree.addEdge(d4, e7);
		tree.addEdge(d4, e8);
		tree.addEdge(d5, e9);
		tree.addEdge(d5, e10);
		tree.addEdge(d6, e11);
		tree.addEdge(d6, e12);
		tree.addEdge(d7, e13);
		tree.addEdge(d7, e14);
		tree.addEdge(d8, e15);
		tree.addEdge(d8, e16);
		
		
		
		
		
		
		
		
		jgraphmodeladapter = new JGraphModelAdapter(tree);
		
		
		JFrame frame = new JFrame(  );
        frame.setSize(1550, 600);
        frame.setResizable(false);
        

		
		positionVertexAt(a,750,0);
		
		positionVertexAt(b1,375,75);
		positionVertexAt(b2,1125,75);
		
		positionVertexAt(c1,188,225);
		positionVertexAt(c2,563,225);
		positionVertexAt(c3,938,225);
		positionVertexAt(c4,1314,225);
		

		positionVertexAt(d1,94,375);
		positionVertexAt(d2,94*3,375);
		positionVertexAt(d3,94*5,375);
		positionVertexAt(d4,94*7,375);
		positionVertexAt(d5,94*9,375);
		positionVertexAt(d6,94*11,375);
		positionVertexAt(d7,94*13,375);
		positionVertexAt(d8,94*15,375);
		
		
		positionVertexAt(e1,47,525);
		positionVertexAt(e2,3*47,525);
		positionVertexAt(e3,5*47,525);
		positionVertexAt(e4,7*47,525);
		positionVertexAt(e5,9*47,525);
		positionVertexAt(e6,11*47,525);
		positionVertexAt(e7,13*47,525);
		positionVertexAt(e8,15*47,525);
		positionVertexAt(e9,17*47,525);
		positionVertexAt(e10,19*47,525);
		positionVertexAt(e11,21*47,525);
		positionVertexAt(e12,23*47,525);
		positionVertexAt(e13,25*47,525);
		positionVertexAt(e14,27*47,525);
		positionVertexAt(e15,29*47,525);
		positionVertexAt(e16,31*47,525);
		
        
        
        JGraph jgraph = new JGraph(jgraphmodeladapter);
        frame.setTitle( "Backward Induction" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add(jgraph);
        frame.setVisible(true);
        
        Node best = getBestOutcomeLeaf(getLeafs(),0);
        System.out.println(best);
        Node next = best;
        while (getParent(next) != null){
        	next = getParent(next);
        	System.out.println(next);
        }

       
		
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
	
	public static Node getBestOutcomeLeaf(Set<Node> leafs, int player){
		Iterator<Node> it1 = leafs.iterator();
		double max =it1.next().getOutcome()[player];
		Node best = new Node();
		for(Iterator<Node> it = leafs.iterator(); it.hasNext(); ){
			Node n = it.next();
			if(n.getOutcome()[player]>=max){
				best = n;
				max=n.getOutcome()[player];
			}
		}
		return best;
	}
	
	public static Node getParent(Node n){
		Iterator<Edge> it = tree.incomingEdgesOf(n).iterator();
		if (it.hasNext()){
			Edge edge = it.next();
			Node parent = tree.getEdgeSource(edge);
			return parent;
		}
		return null;
	}
	
	private static void positionVertexAt(Object vertex, int x, int y){
		DefaultGraphCell cell = jgraphmodeladapter.getVertexCell(vertex);
		AttributeMap attr = cell.getAttributes();
		Rectangle2D bounds = GraphConstants.getBounds(attr);
		
		Rectangle2D newBounds = new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
		
		GraphConstants.setBounds(attr, newBounds);
		
		org.jgraph.graph.AttributeMap cellAttr = new AttributeMap();
		cellAttr.put(cell, attr);
		jgraphmodeladapter.edit(cellAttr,null,null,null);
		

		
	}
	
}
