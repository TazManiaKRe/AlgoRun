package PartOnePrim;

import java.util.Objects;

public class Edge {
    private int weight;
    private boolean inIncluded = false;
    private Vertex v1,v2;

    public Edge(int weight, boolean inIncluded, Vertex v1, Vertex v2) {
        this.weight = weight;
        this.inIncluded = inIncluded;
        this.v1 = v1;
        this.v2 = v2;
    }

    public Edge(int weight, boolean inIncluded, String a, String b) {
    }

    public Vertex getV1() {
        return v1;
    }
    public Vertex getV2() {
        return v2;
    }

    public void setV1(Vertex v1) {
        this.v1 = v1;
    }
    public void setV2(Vertex v2) {
        this.v2 = v2;
    }


    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setInIncluded(boolean included){
        this.inIncluded = included;
    }

    public int getWeight(){
        return this.weight;
    }

    public boolean getisInIncluded() {
        return this.inIncluded;
    }

    public void printEdge(){
        System.out.println("Weight is: "+this.weight);
        System.out.println("Prim is included: " + this.inIncluded);
        v1.printVertex();
        v2.printVertex();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return weight == edge.weight &&
                inIncluded == edge.inIncluded;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, inIncluded);
    }
}
