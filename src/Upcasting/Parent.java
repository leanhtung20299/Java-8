package Upcasting;

public abstract class Parent {
	private int id ; 
	private String name;
	private String birtday;
	
	public Parent(int id, String name, String birtday) {
		super();
		this.id = id;
		this.name = name;
		this.birtday = birtday;
	}

	public Parent() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirtday() {
		return birtday;
	}

	public void setBirtday(String birtday) {
		this.birtday = birtday;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + ", birtday=" + birtday + "]";
	}
	
	
}
