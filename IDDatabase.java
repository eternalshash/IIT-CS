package lab_Ten;

public class IDDatabase {
    private static int numberOfIDs = 0;
    private static final int MAX_DATABASE_SIZE = 5;
    private static Id2[] IDList = new Id2[MAX_DATABASE_SIZE];

    public IDDatabase() {
        // non-parameterized constructor
    }

    public IDDatabase(int maxDatabaseSize) {
        if (maxDatabaseSize > 0) {
            IDList = new Id2[maxDatabaseSize];
        } else {
            IDList = new Id2[MAX_DATABASE_SIZE];
        }
    }

    public int getNumberOfIDs() {
        return numberOfIDs;
    }

    public boolean add(Id2 studentID) {
        if (studentID == null) {
            return false;
        }
        if (numberOfIDs >= MAX_DATABASE_SIZE) {
            return false;
        }
        try {
            if (studentID.getID().equals("INVALID")) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        IDList[numberOfIDs++] = studentID;
        return true;
    }

    public void listNames() {
        if (numberOfIDs == 0) {
            System.out.println("ERROR: empty database.");
            return;
        }
        for (int i = 0; i < numberOfIDs; i++) {
            try {
				System.out.println(IDList[i].getFirstName() + " " + IDList[i].getLastName() +
				        ", Student ID: " + IDList[i].getID());
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
    }
}