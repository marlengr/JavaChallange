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
	
	// aby graf posiadal sciezke eulera musi byc grafem spojnym (dla ka�dych dw�ch jego wierzcho�k�w istnieje ��cz�ca je �cie�ka)
	// oraz moze posiadac max 2 wierzcholki stopnia nieparzystego (wychodzi z niego nieparzysta ilosc drog)
	// Graf sp�jny posiada tylko jedn� sp�jn� sk�adow� obejmuj�c� wszystkie jego wierzcho�ki. 
	// Je�li sk�adowych takich jest wi�cej, to graf nazywamy niesp�jnym
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}