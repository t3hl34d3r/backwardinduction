package backwardinduction;

import java.util.LinkedList;

public class Node {
	//Akármilyen információ
	private String information;	
	private double value=1;
	
	@Override
	public String toString(){
		
		return Double.toString(value);
	}
	
	Node(String asd){
		information = asd;
	}
	
	public double getValue(){
		return value;
	}
	
	public void setValue(int v){
		value = v;
	}
	
	
}
