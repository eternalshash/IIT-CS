package lab_Ten;

public class BoxVolumeCalc {
	private double length;
    private double width;
    private double height;
    private double volume;
    public BoxVolumeCalc() {
        length = 0;
        width = 0;
        height = 0;
        volume = 0;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }
    public void calculateVolume(){
        if(length > 0 && width > 0 && height > 0)
            this.volume = length*height*width;
        else
            this.volume = 0;
    }
}
	
	
	
