package PartOnePrim;

import java.util.*;

public class Graph {
    private Map<Vertex, List<Vertex>> adj;

    public Graph(Map<Vertex, List<Vertex>> adj) {
        this.adj = adj;
    }
    public Graph(){}

    public Map<Vertex, List<Vertex>> getAdj() {
        return adj;
    }

    public void setAdj(Map<Vertex, List<Vertex>> adj) {
        this.adj = adj;
    }

    public void addVertex (String label){
        adj.putIfAbsent(new Vertex(label), new ArrayList<>());
    }
    public void removeVertex(String label){
        Vertex v = new Vertex(label);
        adj.values().stream().forEach(e->e.remove(v));
        adj.remove(new Vertex(label));
    }

    public void addEdge(String label1, String label2){
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }
    public void removeEdge(String label1, String label2){
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adj.get(v1);
        List<Vertex> eV2 = adj.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if(eV2 != null)
            eV2.remove(v1);
    }
    public Graph crateGraph() {
        Graph graph = new Graph();
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");
        graph.addVertex("f");
        graph.addEdge("a","b");
        graph.addEdge("a","c");
        graph.addEdge("b","d");
        graph.addEdge("c","d");
        graph.addEdge("c","f");
        graph.addEdge("c","e");
        graph.addEdge("e","f");
        return graph;
    }

    List<Vertex> getAdjVeri(String label){
        return adj.get(new Vertex(label));
    }

    Set<String> depthFirstTraversal(Graph graph, String root){
        Set<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while(!stack.isEmpty()){
            String vertex = stack.pop();
            if(!visited.contains(vertex)){
                visited.add(vertex);
                for(Vertex ver :graph.getAdjVeri(vertex)){
                    stack.push(ver.label);
                }
            }
        }
        return visited;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graph graph = (Graph) o;
        return Objects.equals(adj, graph.adj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adj);
    }

}
