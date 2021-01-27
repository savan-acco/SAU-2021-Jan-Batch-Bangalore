package com.au.aop.service;

import com.au.aop.model.Circle;
import com.au.aop.model.Rectangle;
import com.au.aop.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	private Rectangle rectangle;
	
	public Circle getCircle() {
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
}
