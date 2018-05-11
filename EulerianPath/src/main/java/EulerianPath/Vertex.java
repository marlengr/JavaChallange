package EulerianPath;

import java.util.LinkedList;

public class Vertex {

	private int vertexNumber; 
	private LinkedList<Edge> edgeList = new LinkedList<Edge>(); // lista krawedzi z wierzcholka
	
	public Vertex(int vertexNumber) {
		this.vertexNumber = vertexNumber;
	}
	
	public int getVertexNumber() {
		return vertexNumber;
	}
	
	//zwraca kopie listy krawedzi
	public LinkedList<Edge> edgeLinkedList(){
		return new LinkedList<Edge>(edgeList);
	}
	
	//dodaje nowa krawedz
	public void addEdge(Edge e) {		
		edgeList.add(e);		
	}
	
	@Override
	public String toString() {
		if(edgeList.size() == 0)
            return "";
 
        String out = new String();
        for(Edge e : edgeList)
            out = out + e.toString() + "\n";
        return out;
	}
}
