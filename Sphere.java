package lab_Ten;

public class Sphere extends CircleSolid{
	
	public Sphere() {
		super();
	}
	
	public Sphere(double r) {
		super(r);
	}
	
	public double getVolume() {
		
		double constant = ((double)4/(double)3);
		return (constant * Math.PI * Math.pow(this.r, 3));
	}
	
	public String toString() {
		return super.toString() +  "\n" + "Volume: " + getVolume();
	}
	
	
}
