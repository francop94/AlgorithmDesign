/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franco
 */
public class Vertex {

    public int object;

    public Vertex(int obj) {
        this.object = obj;

    }

    public int getObj() {
        return object;
    }
    
    //ausiliary function for making tests
    public String toString(){
        return ""+ this.getObj();
    }
}
