package rectangleconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.au.spring.Point;

public class Triangle implements InitializingBean,DisposableBean{
	
	@Autowired
	@Qualifier("PointA")
	private Point PointA;
	
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
	@Autowired
	@Qualifier("PointB")
	private Point PointB;
	
	@Autowired
	@Qualifier("PointC")
	private Point PointC;
	
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void getTheCordinates() {
		System.out.println("PointA"+getPointA().getX()+"PointA"+getPointA().getY());
		System.out.println("PointB"+getPointB().getX()+"PointB"+getPointB().getY());
		System.out.println("PointC"+getPointC().getX()+"PointC"+getPointC().getY());
	}
 
	
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean destroy method called for Triangle");	
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean init method called for Triangle whenever created");
	}
	
	

}
