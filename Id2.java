package lab_Ten;

public class Id2 {
	private String aNumber;
	private String name1;
	private String name2;
	
	public Id2(String aNumber, String name1, String name2) {
		this.aNumber = aNumber;
		this.name1 = name1;
		this.name2 = name2;
	}
	
	public String getID() throws Exception {
		if(aNumber.length() > 9) {
			System.out.println("INVALID");
			throw new Exception("Student ID must be no longer than 9 characters");
			
		}else if(aNumber.length() < 9) {
			System.out.println("INVALID");
			throw new Exception("Student ID must be no shorter than 9 characters");
			
		}
		
		this.aNumber = aNumber;
		
		return this.aNumber;
		 
		
	}
	
	public String getFirstName() {
		if(aNumber.length() != 9) {
			this.name1 = "INVALID";
		} else {
			this.name1 = name1;
		}
		return this.name1;
		
	}
	
	public String getLastName() {
		if(aNumber.length() != 9) {
			this.name2 = "INVALID";
		} else {
			this.name2 = name2;
		}
		return this.name2;
	}
	
	
}
