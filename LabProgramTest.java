package lab_Ten;

public class LabProgramTest {
	public static void main(String args[]) {
		//BoxVolumeCalc myCalc = new BoxVolumeCalc();
		
		BoxVolumeCalc box = new BoxVolumeCalc();
		
		System.out.println(String.format("The intial dimensions of the box are %.2f  %.2f  %.2f",
                box.getLength(),box.getWidth(),box.getHeight()));
		
		
        box.setLength(2.0);
        box.setWidth(3.0);
        box.setHeight(4.0);
        box.calculateVolume();
        System.out.println(String.format("The volume of the box is: %.2f x %.2f x %.2f is: %.2f",
                box.getLength(),box.getWidth(),box.getHeight(),box.getVolume()));
		
		
		
		//System.out.println("Initial dimensions:");
		

		
		
	}
}
