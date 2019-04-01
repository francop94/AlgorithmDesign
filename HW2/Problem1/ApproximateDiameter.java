
import java.util.HashSet;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franco
 */
public class ApproximateDiameter {
    public static void main(String[] args) {
        HashSet<Point> PointList= new HashSet<>();
        Point p1= new Point(4,2);
        Point p2= new Point(-4,0);
        Point p3= new Point(0,-5);
        Point p4= new Point(4,0);
        Point p5= new Point(1,0);
        Point p6= new Point(1,3);
        Point p7= new Point(3,3);
        PointList.add(p1);
        PointList.add(p2);
        PointList.add(p3);
        PointList.add(p4);
        PointList.add(p5);
        PointList.add(p6);
        PointList.add(p7);
        Iterator<Point> iterator1= PointList.iterator();
        while(iterator1.hasNext()){
            Point p=iterator1.next();
            System.out.println("PointList values: "+p);
        }
        HashSet<Point> a=MinMaxCoordinates(PointList);
        
        Iterator<Point> iterator2= a.iterator();
        while(iterator2.hasNext()){
            Point p10=iterator2.next();
            System.out.println("New list values: "+p10);
        }
        System.out.println(EuclideanDistance(a));
        System.out.println(EuclideanDistance(PointList));
        
        
        
    }
    public static HashSet<Point> MinMaxCoordinates(HashSet<Point> a){
        Iterator<Point> iterator= a.iterator();
        Point maxX=new Point(Integer.MIN_VALUE,0);
        Point maxY=new Point(0,Integer.MIN_VALUE);
        Point minX=new Point(Integer.MAX_VALUE,0);
        Point minY=new Point(0,Integer.MAX_VALUE);
        while(iterator.hasNext()){
            Point p=iterator.next();
            if(maxX.getX()<p.getX()) maxX=p;
            if(maxY.getY()<p.getY()) maxY=p;
            if(minX.getX()>p.getX()) minX=p;
            if(minY.getY()>p.getY()) minY=p;
            
        }
        System.out.println("MaxX="+maxX);
        System.out.println("MaxY="+maxY);
        System.out.println("MinX="+minX);
        System.out.println("MinY="+minY);
        HashSet<Point> minMax= new HashSet<>();
        minMax.add(maxX);
        minMax.add(maxY);
        minMax.add(minX);
        minMax.add(minY);
      
        return minMax;
    }
    
    public static double EuclideanDistance(HashSet<Point> a){
        double dist=0;
        Iterator<Point> iterator1= a.iterator();
        
        while(iterator1.hasNext()){
            Point p=iterator1.next();
            
            Iterator<Point> iterator2= a.iterator();
            while(iterator2.hasNext()){
                Point p2=iterator2.next();
                dist=Math.max(dist, Math.sqrt((Math.pow(p.getX()-p2.getX(),2))+ (Math.pow(p.getY()- p2.getY(),2))));
                
            }
        }
        return dist;
    }
}
