package PartOneGraph;
import java.util.List;
import java.util.Iterator;



public class Prim {
    private List<Vertex> graph;
    public Prim(List<Vertex> graph){ //constractor
        this.graph = graph;
    }
    public void run(){ //can be a main with
        if (graph.size() >0) //every class have there size func
            graph.get(0).setVisited(true);
        while(isDisconnected()){
            Edge nextMinimum = new Edge(Integer.MAX_VALUE);
            Vertex nextVertex = graph.get(0); // for getting the next one
            for(Vertex vertex : graph){
                if (vertex.isVisited()){
                    //Pair();
                }
            }
        }
    }
    //public static void main(String[] args){}
    private boolean isDisconnected(){
        for (Vertex vertex : graph){
            if (!vertex.isVisited()){
                return true;
            }
        }
        return false;
    }
}
