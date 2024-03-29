package PartOnePrim;
import java.util.*;
import java.util.Objects;

public class Vertex {
    private String label = null;
    public Vertex (String label){
        this.label=label;
    }

    public void setLabel(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }

    public void printVertex(){
        System.out.println("Vertex: " + this.label);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(label, vertex.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }
}
