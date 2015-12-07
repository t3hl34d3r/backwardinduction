package backwardinduction;

import java.util.LinkedList;

public class Node {
	//Akármilyen információ
	private String name;	
	private double value=1;
	
	private double b = -3;
	private double p = 5;
	
	private double outcome[] = new double[4];
	
	@Override
	public String toString(){
		
		return name;
	}
	
	Node(){
		
	}
	
	Node(String asd){
		name = asd;
	}
	
	Node(double n){
		value = n;
	}
	
	public double getValue(){
		return value;
	}
	
	public void setValue(int v){
		value = v;
	}
	
	public double[] getOutcome(){
		return outcome;
	}
	
	public void setOutcome(double[] o){
		outcome = o;
	}
	
	
}
