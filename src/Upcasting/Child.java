package Upcasting;

public class Child extends Parent{
	private int classNumber;
	private int code;
	
	public Child() {
	
	}
	
	

	public Child(int id, String name, String birtday, int classNumber, int code) {
		super(id, name, birtday);
		this.classNumber = classNumber;
		this.code = code;
	}



	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}



	@Override
	public String toString() {
		return "Child [classNumber=" + classNumber + ", code=" + code + ", toString()=" + super.toString() + "]";
	}
	
	
}
