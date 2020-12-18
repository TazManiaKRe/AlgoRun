package PartOneGraph;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Objects;


public class Vertex { //kodkod
    private String label = null;
    private Map<Vertex, Edge> edges = new HashMap<>();
    private boolean isVisited = false;

    public Vertex(String label){//constactor
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public Map<Vertex, Edge> getEdges(){
        return this.edges;
    }
    public void addEdge(Vertex vertex, Edge edge){//implamtns afetr
    }
    public void setVisited (boolean visited){
        this.isVisited = visited;
    }
    public boolean isVisited(){
        return isVisited;
    }


    //(1,"one")
   // public Pair<Vertex, Edge> nextMin(){
    //    return new Pair<>;
     //   }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return isVisited == vertex.isVisited &&
                Objects.equals(label, vertex.label) &&
                Objects.equals(edges, vertex.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, edges, isVisited);
    }
}
