package EulerianPath;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {

	private ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
	private int vertexCount; // liczba wierzcho³ków w grafie
	
	public Graph() {
		vertexCount = 0;
	}
	
	public Graph(int vertexCount) {
		this.vertexCount = vertexCount;		
		 for(int i=0; i<vertexCount; i++)
	            vertexList.add(new Vertex(i));
	}
	
	public String toString() {
		 String out = new String();
		 
	        for(Vertex v : vertexList)
	            if(v != null && v.toString() != "")
	                out = out + v.toString() + "\n";
	        return out;
	}
	

	
	//dodanie wierzcholka
	public void addVertex() {
		vertexList.add(new Vertex(vertexCount));
		vertexCount++;
	}
	//dodanie krawêdzi
	public void addEdge(Edge e) {
		vertexList.get(e.getBegin().getVertexNumber()).addEdge(e);
		
		
		//vertexList.addEdge(e);
	}
	
	public void addEdge(int begin, int end) {
		 if( begin>=0 && begin<=vertexCount && end>=0 && end<=vertexCount && vertexList.get(begin)!=null && vertexList.get(end)!=null)
	            addEdge( new Edge(vertexList.get(begin), vertexList.get(end)) ); 
	}
	
	
	
	
	
	
	
	
	
}
