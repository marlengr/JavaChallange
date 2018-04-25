import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class GraphEul{
	
	public void createGraph() {
	SimpleGraph<String, DefaultEdge> graph;
	graph = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
	
	graph.addVertex("v1");
	graph.addVertex("v2");
	graph.addVertex("v3");
	graph.addVertex("v4");
	graph.addVertex("v5");
	
	graph.addEdge("v1", "v2");
	graph.addEdge("v2", "v3");
	graph.addEdge("v1", "v5");
	graph.addEdge("v2", "v4");
	graph.addEdge("v4", "v5");
	System.out.println(graph.toString());		
	
	}
	
	// aby graf posiadal sciezke eulera musi byc grafem spojnym (dla ka¿dych dwóch jego wierzcho³ków istnieje ³¹cz¹ca je œcie¿ka)
	// oraz moze posiadac max 2 wierzcholki stopnia nieparzystego (wychodzi z niego nieparzysta ilosc drog)
	// Graf spójny posiada tylko jedn¹ spójn¹ sk³adow¹ obejmuj¹c¹ wszystkie jego wierzcho³ki. 
	// Jeœli sk³adowych takich jest wiêcej, to graf nazywamy niespójnym
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}