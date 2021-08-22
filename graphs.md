# Graphs

## Challenge 
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

add node
Arguments: value
Returns: The added node
Add a node to the graph
add edge
Arguments: 2 nodes to be connected by the edge, weight (optional)
Returns: nothing
Adds a new edge between two nodes in the graph
If specified, assign a weight to the edge
Both nodes should already be in the Graph
get nodes
Arguments: none
Returns all of the nodes in the graph as a collection (set, list, or similar)
get neighbors
Arguments: node
Returns a collection of edges connected to the given node
Include the weight of the connection in the returned collection
size
Arguments: none



## Code 

public class Vertex<K>{

  K value;


  public Vertex(K value ) {

    this.value = value;

  }

  public K getValue() {

    return value;
  }

  public void setValue(K value) {

    this.value = value;
  }



  @Override
  public boolean equals(Object node) {


    return value.equals(node);
  }

  @Override
  public int hashCode() {

    return Objects.hash(value);
  }
}


public class Graph< K> {


  private Map< Vertex< K>, Map< Vertex< K>, Integer>> vertices;

  public Graph() {


    this.vertices = new HashMap<>();

  }

  public Vertex< K> addNode(K data){


    Vertex<K> vertex = new Vertex<>(data);
    Map<Vertex<K>,Integer> values = new HashMap<>();
    vertices.putIfAbsent(vertex , values);

    return vertex;

  }

  public void addEdge(Vertex< K> vertex1, Vertex< K> vertex2){


    Map< Vertex< K>,Integer> values;

    vertices.get(vertex1).putIfAbsent(vertex2,0);
    vertices.get(vertex2).putIfAbsent(vertex1,0);
  }

  public void addEdge(Vertex< K> vertex1, Vertex< K> vertex2, Integer weight){

    Map< Vertex<  K>,Integer> values;

    vertices.get(vertex1).putIfAbsent(vertex2,weight);
    vertices.get(vertex2).putIfAbsent(vertex1,weight);
  }

  public Set< Vertex< K>> getNodes(){

    return vertices.keySet();
  }

  public Map< Vertex< K>, Integer> getNeighbors(Vertex< K> vertex){

    return vertices.get(vertex);
  }

  public int size(){

    return vertices.keySet().size();
  }

  public List< Integer> getValues(Map< Vertex< K>,Integer> map){


    List< Integer> values = new ArrayList<>();
    for (Vertex< K> key:
      map.keySet()) {
      values.add(map.get(key));
    }
    return values;
  }

  @Override
  public String toString() {
      
    StringBuilder stringBuilder =new StringBuilder();
    for (Vertex< K> vertex:
      vertices.keySet()) {
      stringBuilder.append(vertex.getValue());
      stringBuilder.append(":");
      stringBuilder.append(this.getValues(vertices.get(vertex)));
      stringBuilder.append(" ; ");
    }
    return stringBuilder.toString();
  }
}



## Approach and Efficiency 
Big(O)
* addNode : O(n) for time.
* addEdge : O(n)for time.
* getNodes : O(n)for time.



## Tests
