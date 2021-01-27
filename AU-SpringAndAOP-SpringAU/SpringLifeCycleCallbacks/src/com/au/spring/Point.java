package com.au.spring;

import org.springframework.beans.factory.DisposableBean;

import org.springframework.beans.factory.InitializingBean;

public class Point implements InitializingBean,DisposableBean{
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for Point");		
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Point whenever created");
		
	}
	
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
