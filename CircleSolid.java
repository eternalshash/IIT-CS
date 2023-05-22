package lab_Ten;

public abstract class CircleSolid {
	protected double r;
	
	public CircleSolid() { 
		this.r = 0;
		
		
	}
	
	public CircleSolid(double newR) {
		this.r = newR;
	}
	
	public void setRadius(double newR) {
		if(newR > 0) {
			this.r = newR;
		} else {
			System.exit(0);
		}
	}
	
	public double getRadius() {
		return this.r;
	}
	
	public double getCircumfrance() {
		return 2*(Math.PI * this.r);
	}
	
	public double getArea() {
		return (Math.PI * (Math.pow(this.r, 2)));
		
	}
	public abstract double getVolume();
	
	public String toString() {
		return "CircleSolid: Radius = " + this.r; 
	}
	
}
