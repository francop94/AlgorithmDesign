
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author franco
 */
public class Edge {

    public Vertex vertex1;
    public Vertex vertex2;

    public Edge(Vertex v1, Vertex v2) {
        this.vertex1 = v1;
        this.vertex2 = v2;

    }
    
    //ausiliary function for making tests
    public Vertex getVertex1() {
        return vertex1;
    }

    //ausiliary function for making tests
    public Vertex getVertex2() {
        return vertex2;
    }

}
