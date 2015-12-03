package backwardinduction;

import java.util.LinkedList;

public class Node {
	//Akármilyen információ
	private String information;
	//Ha nincs gyerek akkor NULL;
	private LinkedList<Node> childs;
	
	public LinkedList<Node> getChilds(){
		return childs;
	}
	
	public void addChild(Node n){
		childs.add(n);
	}
	
	public void deleteChild(Node n){
		childs.remove(n);
	}
	
	public boolean isLeaf(Node n){
		if (n.childs.equals(null))
			return true;
		return false;
	}
	
}
