package EulerianPath;

public class Edge {

	private Vertex begin, end;
	
	public Edge(Vertex begin, Vertex end) {		
		this.end = end;
		this.begin = begin;	
	}
	
	public Vertex getBegin() {
		return begin;
	}
	
	public Vertex getEnd() {
		return end;
	}
	
	@Override
	public String toString() {
		return Integer.toString(begin.getVertexNumber()) +
				Integer.toString(end.getVertexNumber());		
	}
}
