package rectangleconfig;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.au.spring.Point;

public class Rectangle {

	@Autowired
	@Qualifier("PointA")
	private Point PointA;
	
	@Autowired
	@Qualifier("PointB")
	private Point PointB;
	
	@Autowired
	@Qualifier("PointC")
	private Point PointC;
	
	@Autowired
	@Qualifier("PointD")
	private Point PointD;

	public Point getPointA() {
		return PointA;
	}

	public void setPointA(Point pointA) {
		PointA = pointA;
	}

	public Point getPointB() {
		return PointB;
	}

	public void setPointB(Point pointB) {
		PointB = pointB;
	}

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		PointC = pointC;
	}

	public Point getPointD() {
		return PointD;
	}

	public void setPointD(Point pointD) {
		PointD = pointD;
	}

	
	public void getTheCordinates() {
		System.out.println("PointA"+getPointA().getX()+"PointA"+getPointA().getY());
		System.out.println("PointB"+getPointB().getX()+"PointB"+getPointB().getY());
		System.out.println("PointC"+getPointC().getX()+"PointC"+getPointC().getY());
		System.out.println("PointC"+getPointD().getX()+"PointC"+getPointD().getY());
	}
 
	
	
	
}

