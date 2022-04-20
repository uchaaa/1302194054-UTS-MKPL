package lib;

public class DataEmployee {

    private enum MacamGender{
		PRIA,
		PEREMPUAN
	}

    private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
    private boolean isForeigner;
	private MacamGender gender;

    public String getEmployeeId() {
		return employeeId;
	}

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

	public String getFirstName() {
		return firstName;
	}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

	public String getLastName() {
		return lastName;
	}
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

	public String getIdNumber() {
		return idNumber;
	}

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

	public String getAddress() {
		return address;
	}

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isForeigner() {
		return isForeigner;
	}

    public MacamGender getGender() {
		return gender;
	}

    public void setGender(MacamGender gender) {
        this.gender = gender;
    }

}