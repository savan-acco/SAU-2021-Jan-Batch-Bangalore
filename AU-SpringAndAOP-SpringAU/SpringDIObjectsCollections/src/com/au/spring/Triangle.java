package com.au.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangle {
	
	private List<Point> points; 
	
	// to get unique points only
	Set<Point> hash_Set = new HashSet<Point>(); 
	
	// the list of triangles sharing a common point in them
	HashMap<Point, ArrayList<Triangle>> plist = new HashMap<>(); 
	
	public List<Point> getPoints(){
		return points;
	}
	
	public void setPoints(List<Point> points){
		this.points = points;
	}
	/*private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}*/
	
	public void getUniquePoints()
	{
		for (Point value : hash_Set) 
		{
			Point p=value;
			System.out.println(p.getX()+" "+p.getY()); 
		}
	}
	
	
	public void addtrianglesWithSamePoint(Point p,List<Triangle> arr)
	{
		plist.put(p, (ArrayList<Triangle>) arr);
	}
	
	
	public void draw() {
		
		for(Point point:points) {
			System.out.println("PointA = "+point.getX()+","+point.getY());
		}
		/*System.out.println("PointA"+getPointA().getX()+"PointA"+getPointA().getX());
		System.out.println("PointB"+getPointA().getX()+"PointB"+getPointB().getX());
		System.out.println("PointC"+getPointA().getX()+"PointC"+getPointC().getX());*/
	}

}
