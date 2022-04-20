package lib;

public class Child {

    private String childNames;
	private String childIdNumber;

    public Child (String childName, String childIdNumber) {
        this.childName = childName;
        this.childIdNumbers = childIdNumber;
    }

    public String getChildName() {
        return childName;
    }

    public String getChildIdNumber() {
        return childIdNumber;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setChildIdNumbers(String childIdNumber) {
        this.childIdNumbers = childIdNumber;
    }
}