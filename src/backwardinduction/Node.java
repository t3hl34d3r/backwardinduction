package backwardinduction;

import java.util.LinkedList;

public class Node {
	//Ak�rmilyen inform�ci�
	private String information;	
	private double value=1;
	
	@Override
	public String toString(){
		
		return Double.toString(value);
	}
	
	Node(String asd){
		information = asd;
	}
	
	
	
}
