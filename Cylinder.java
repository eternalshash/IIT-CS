package lab_Ten;

import java.lang.Math;

//Math.PI
//Math.pow(num1 num2)

public class Cylinder extends CircleSolid{
	//inheriting radius 
	protected double height;
	
	public Cylinder() {
		super();
	}

	public Cylinder(double r, double h) {
		super(r);
		this.height = h;
	}
	
	public void setHeight(double newH) {
		if(newH > 0) {
			this.height = newH;
		} else {
			System.out.println("INVALID");
			System.exit(0);
		}
	}
	
	public double getHeight() {
		return this.height;
	}
	
	
	public double getVolume() {
		return (Math.PI) * Math.pow(this.r, 2) * this.height;
	}
	
	public String toString () {
		return super.toString() + "\n" + "Cylinder: Height = " + getHeight() + " Volume = " + getVolume();
	}
	
}
