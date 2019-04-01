/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franco
 */
import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph {
    private int numVertices;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Vertex> adj[];
    int[] children_array;

    // Constructor

    Graph() {
        adj = new LinkedList[this.numVertices];
        children_array = new int[this.numVertices];
        numVertices = 0;
    }

    //Function to add an edge into the graph
    void addEdge(Vertex v, Vertex w) {
        adj[v.getObj()].add(w);  // Add w to v's list.

    }

    void addVertex(Vertex v) {
        numVertices++;
        adj = new LinkedList[this.numVertices];
        children_array = new int[this.numVertices];
        for (int i = 0; i < numVertices; ++i) {
            adj[i] = new LinkedList();
        }

    }
    
    //ausiliary function for making tests
    int getSizeAdj() {
        return adj.length;
    }

    //ausiliary function for making tests
    void getAdjacence(Vertex v) {
        System.out.println(adj[v.getObj()].toString());
    }

    // A function used by DFS
    int DFS(Vertex v) {
        // Mark the current node as visited and print it
        int children = 0;
        int hub_conductor = 0;
        boolean visited[] = new boolean[numVertices];
        visited[v.getObj()] = true;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Vertex> i = adj[v.getObj()].listIterator();
        if (adj[v.getObj()].size() == 0) {
            children = 0;
        }
        while (i.hasNext()) {
            Vertex n = i.next();
            if (!visited[n.getObj()]) {
                children += 1 + DFS(n);
            }

        }
        children_array[v.getObj()] = children;
        return children;
    }
    
    //ausiliary function for making tests
    int[] getArrayNumChildren() {
        return children_array;
    }

    int hubConductor() {
        int hub_conductor = 0; 
        for (int j = 0; j < numVertices; j++) {
            if (children_array[j] == numVertices / 2) {
                hub_conductor = j;
            } else {
                if (children_array[j] > Math.floor(numVertices / 2) && children_array[j] < numVertices) {
                    if (children_array[j] < children_array[j + 1] && j + 1 < numVertices) {
                        hub_conductor = j;
                    }
                    hub_conductor=j;
                }
            }
        }
        return hub_conductor;

    }

}
