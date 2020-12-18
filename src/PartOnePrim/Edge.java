package PartOnePrim;

import java.util.Objects;

public class Edge {
    private int weight;
    private boolean inIncluded = false;

    public Edge(int weight, boolean inIncluded) {
        this.weight = weight;
        this.inIncluded = inIncluded;
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
