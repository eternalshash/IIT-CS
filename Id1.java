package lab_Ten;

public class Id1 {
	public static void main(String[] args) {
		
		Id2 studentA = new Id2("A20907287", "Shashwat", "Choudhry");	
		Id2 studentB = new Id2("A00000002", "John", "Doe");
		Id2 studentC = new Id2("", "Janet", "Smith");
		Id2 studentD = new Id2("", "", "Smith");
		Id2 studentE = new Id2("", "", "");
		Id2 studentF = new Id2("A00111112", "Cate", "Blanchett");
		Id2 studentG = new Id2("A10111115", "Keanu", "Reaves");


		OutputInfo.displayStudentInfo(studentA);
		OutputInfo.displayStudentInfo(studentB);
		OutputInfo.displayStudentInfo(studentC);
		OutputInfo.displayStudentInfo(studentD);
		OutputInfo.displayStudentInfo(studentE);
		OutputInfo.displayStudentInfo(studentF);
		OutputInfo.displayStudentInfo(studentG);		
		
	}
}
