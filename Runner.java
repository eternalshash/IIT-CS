package lab_Ten;
//import java.text.NumberFormat;


public class Runner {
	private String name;
	private int marathonTimeSeconds;
	private static final int WORLD_RECORD_TIME_SECONDS = (2*3600 + 1*60 + 39);
	public Runner (String n, int h, int m, int s){
	    name = n;
	    setTime(h, m, s);
	  }
	
	public void setTime (int h, int m, int s){
	    if (h >= 0 && m >= 0 && s >= 0) 
	      marathonTimeSeconds = (h * 60 * 60) + (m * 60) + s;
	  }
	
	public String getName() { return name; }
	public int getSeconds() { return marathonTimeSeconds; } //should be in seconds !
	
	public double percentageSlower (){
		//WORLD_RECORD_TIME_SECONDS = integer (2.0*3600 + 1.0*60 + 39.0);
		double percentslower = ((double) marathonTimeSeconds / WORLD_RECORD_TIME_SECONDS) - 1.0;
		double res = (int)Math.round((percentslower * 100));
		return res;
	}
		
	
	public Runner (String n, String data) {
		String[] ar = data.split(":");
		name=n;
		int h =Integer.parseInt(ar[0]),m=Integer.parseInt(ar[1]),s=Integer.parseInt(ar[2]);

		if(h >= 0 && m >= 0 && s >=0 ){ 
			marathonTimeSeconds= (h*60*60) + (m*60) + s;
		}else {
			System.out.println("Non usable values please try again!");
		}
	}	
	
}
