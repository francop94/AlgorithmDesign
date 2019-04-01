
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author franco
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////////////////////////////////////////////TESTS FOR THE PROBLEM 1///////////////////////////////////////////////////////////");
        double array1[] = {5, 0.75, 2};
        double array2[] = {0, 5, 2, 0.3, 7.8, 8, 2.3};
        double array3[] = {0, 0, 0, 0, 0, 0, 0};
        double array4[] = {0, 0.5, 0, 0, 0, 0, 0};
        double array5[] = {0, 0.5, 0, 0, 0, 0, 2};
        double array6[] = {1, 1, 1, 0.3, 1, 1, 1};
        double array7[] = {0.3, 0.5, 0.4, 0.3, 0.8, 0.8, 0.03};
        double array8[] = {2, 5, 10, 13, 78, 18, 23};
        double array9[] = {2, 5, 0, 0.3, 78, 22.3, 22};
        double array10[] = {1, 5, 0, -0.07, 78, 22.8, 2.3};
        double array11[] = {0, 5, 0, 0.3, 18, 12.8, 12};
        double array12[] = {0, 1, 0, 0.2, 28, 11.8, 10};
        double array13[] = {2, 5, 0, 0.3, 3.8, 10.8, 0};
        double array14[] = {4, 12, 0, 0.3, 4.8, 3, 0.1};
        double array15[] = {0.2, 3, 0, 0.3, 5.8, 0, 9};
        double array16[] = {0.6, 5, 0, 0.3, 7, 1, 0.4};
        double array17[] = {0, 2, 0.5, 0.3, 8, 12, 2};
        double array18[] = {0, -1, 0, 0.3, 7.8, 8.4, 11};
        double array19[] = {1, 1, 0.4, 0, 7, 0.3, 3.7};
        double array20[] = {1, 0, 2, 1, 12, 0.5, 3, 0};
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array1)) + " for this array:" + Arrays.toString(array1));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array2)) + " for this array:" + Arrays.toString(array2));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array3)) + " for this array:" + Arrays.toString(array3));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array4)) + " for this array:" + Arrays.toString(array4));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array5)) + " for this array:" + Arrays.toString(array5));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array6)) + " for this array:" + Arrays.toString(array6));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array7)) + " for this array:" + Arrays.toString(array7));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array8)) + " for this array:" + Arrays.toString(array8));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array9)) + " for this array:" + Arrays.toString(array9));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array10)) + " for this array:" + Arrays.toString(array10));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array11)) + " for this array:" + Arrays.toString(array11));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array12)) + " for this array:" + Arrays.toString(array12));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array13)) + " for this array:" + Arrays.toString(array13));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array14)) + " for this array:" + Arrays.toString(array14));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array15)) + " for this array:" + Arrays.toString(array15));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array16)) + " for this array:" + Arrays.toString(array16));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array17)) + " for this array:" + Arrays.toString(array17));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array18)) + " for this array:" + Arrays.toString(array18));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array19)) + " for this array:" + Arrays.toString(array19));
        System.out.println("Maximum Sub array product is "
                + (findMaxProductSubarray.max_product(array20)) + " for this array:" + Arrays.toString(array20));
        System.out.println("//////////////////////////////////////////////////////////////////////////////////TESTS FOR THE PROBLEM 2///////////////////////////////////////////////////////////");
        Graph g1 = new Graph();
        Vertex v1 = new Vertex(0);
        Vertex v2 = new Vertex(1);
        Vertex v3 = new Vertex(2);
        Vertex v4 = new Vertex(3);
        Vertex v5 = new Vertex(4);
        Vertex v6 = new Vertex(5);
        Vertex v7 = new Vertex(6);

        g1.addVertex(v1);
        g1.addVertex(v2);
        g1.addVertex(v3);
        g1.addVertex(v4);
        g1.addVertex(v5);
        g1.addVertex(v6);
        g1.addVertex(v7);

        g1.addEdge(v1, v2);
        g1.addEdge(v2, v3);
        g1.addEdge(v3, v4);
        g1.addEdge(v4, v5);
        g1.addEdge(v5, v6);
        g1.addEdge(v6, v7);

        g1.DFS(v1);
        g1.DFS(v2);
        g1.DFS(v3);
        g1.DFS(v4);
        g1.DFS(v5);
        g1.DFS(v6);
        g1.DFS(v7);

        System.out.println(Arrays.toString(g1.getArrayNumChildren()));
        System.out.println("The hub conductor is the Vertex number(this is the object declared in the constructor of the Vertex related):" + g1.hubConductor());
        
        Graph g2 = new Graph();
        Vertex v8 = new Vertex(0);
        Vertex v9 = new Vertex(1);
        Vertex v10 = new Vertex(2);
        Vertex v11 = new Vertex(3);
        Vertex v12 = new Vertex(4);
        Vertex v13 = new Vertex(5);
        Vertex v14 = new Vertex(6);

        g2.addVertex(v8);
        g2.addVertex(v9);
        g2.addVertex(v10);
        g2.addVertex(v11);
        g2.addVertex(v12);
        g2.addVertex(v13);
        g2.addVertex(v14);

        g2.addEdge(v8, v9);
        g2.addEdge(v8, v10);
        g2.addEdge(v10, v11);
        g2.addEdge(v10, v12);
        g2.addEdge(v12, v13);
        g2.addEdge(v12, v14);

        g2.DFS(v8);
        g2.DFS(v9);
        g2.DFS(v10);
        g2.DFS(v11);
        g2.DFS(v12);
        g2.DFS(v13);
        g2.DFS(v14);

        System.out.println(Arrays.toString(g2.getArrayNumChildren()));
        System.out.println("The hub conductor is the Vertex number(this is the object declared in the constructor of the Vertex related):" + g2.hubConductor());
        
        Graph g3 = new Graph();
        Vertex v15 = new Vertex(0);
        Vertex v16 = new Vertex(1);
        Vertex v17 = new Vertex(2);
        Vertex v18 = new Vertex(3);
        Vertex v19 = new Vertex(4);
        Vertex v20 = new Vertex(5);
        Vertex v21 = new Vertex(6);

        g3.addVertex(v15);
        g3.addVertex(v16);
        g3.addVertex(v17);
        g3.addVertex(v18);
        g3.addVertex(v19);
        g3.addVertex(v20);
        g3.addVertex(v21);

        g3.addEdge(v15, v16);
        g3.addEdge(v16, v17);
        g3.addEdge(v16, v18);
        g3.addEdge(v19, v20);
        g3.addEdge(v19, v21);
        g3.addEdge(v15, v19);

        g3.DFS(v15);
        g3.DFS(v16);
        g3.DFS(v17);
        g3.DFS(v18);
        g3.DFS(v19);
        g3.DFS(v20);
        g3.DFS(v21);

        System.out.println(Arrays.toString(g3.getArrayNumChildren()));
        System.out.println("The hub conductor is the Vertex number(this is the object declared in the constructor of the Vertex related):" + g3.hubConductor());
        
        Graph g4= new Graph();
        Vertex ve1=new Vertex(0);
        Vertex ve2=new Vertex(1);
        
        g4.addVertex(ve1);
        g4.addVertex(ve2);
        
        g4.addEdge(ve1, ve2);
        
        g4.DFS(ve1);
        g4.DFS(ve2);
        
        System.out.println(Arrays.toString(g4.getArrayNumChildren()));
        System.out.println("The hub conductor is the Vertex number(this is the object declared in the constructor of the Vertex related):" + g4.hubConductor());
        
        Graph g5 = new Graph();
        Vertex vertex1 = new Vertex(0);
        Vertex vertex2 = new Vertex(1);
        Vertex vertex3 = new Vertex(2);
        Vertex vertex4 = new Vertex(3);
        
        g4.addVertex(vertex1);
        g4.addVertex(vertex2);
        g4.addVertex(vertex3);
        g4.addVertex(vertex4);
        
        g4.addEdge(vertex1, vertex2);
        g4.addEdge(vertex2, vertex3);
        g4.addEdge(vertex2, vertex4);
        
        g4.DFS(vertex1);
        g4.DFS(vertex2);
        g4.DFS(vertex3);
        g4.DFS(vertex4);

        System.out.println(Arrays.toString(g4.getArrayNumChildren()));
        System.out.println("The hub conductor is the Vertex number(this is the object declared in the constructor of the Vertex related):" + g4.hubConductor());
        
        System.out.println("/////////////////////////////////////////////////////////////////////////////////TESTS FOR THE PROBLEM 4.1///////////////////////////////////////////////////////////");
        int p1[] = {6, 8, 7, 16};
        int p2[] = {6, 8, 7, 10};
        int p3[] = {3, 2, 15, 1};
        System.out.println("Min completion time is "
                + (completionTime.minCT(p1,4)) + " for this array:" + Arrays.toString(p1));
        System.out.println("Min completion time is "
                + (completionTime.minCT(p2,3)) + " for this array:" + Arrays.toString(p2));
        System.out.println("Min completion time is "
                + (completionTime.minCT(p3,3)) + " for this array:" + Arrays.toString(p3));
        
        

    }
}
