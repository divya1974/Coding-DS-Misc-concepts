package main;

import java.util.PriorityQueue;

import entities.Node;
import entities.TopKelements;

public class MainApplication {

	public static void main(String[] args) {
		
		
		TopKelements obj=new TopKelements();
		obj.AddElement(1);
		obj.AddElement(5);
		obj.AddElement(2);
		obj.AddElement(6);
		obj.AddElement(4);
		obj.AddElement(5);
		obj.AddElement(1);
		obj.AddElement(4);
		obj.AddElement(4);
		obj.AddElement(4);
		
		obj.ReadTopK();


	}

}
