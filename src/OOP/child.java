package OOP;

import java.util.ArrayList;
import java.util.List;

public class child extends parent {
	public int childid;  // instance variable / class variable
	static int c2 = 100; // static varaible
	
//	public child() {	
//	  super();
//	  System.out.println("running child");
//	}
	
	

  @Override
  public void display2() {
    System.out.println("ABC");
    int a = 10; 
    int b = 10;
    b = a;
  }
  
  public child(int a, int c, int childid) {
    super(a, c);
    System.out.println("running child");
    this.childid = childid;
  }
	// overloading
  public child(int a, int c , float d) {
    super(a, c);
    System.out.println("running child");
    this.childid = childid;
  }
	public void abc() {
	  int a;
	  //local variable 
	  List<String> list = new ArrayList<String>();
	  list.add(new String("23a")); 
	}
	
}
