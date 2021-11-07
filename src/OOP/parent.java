package OOP;

abstract class  parent {
  
	private int a;
	private int c;
	
//	public parent() {
//    
//  }
	
	public parent(int a, int c) {
   
    System.out.println("running parent");
    this.a = a;
    this.c = c;
  }

  void run() {
		System.out.println("running parent");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int getC() {
		return c;
	}

	public static void main(String args[]) {
		parent b = new Splendor();
		b.setC(12);
		System.out.println(b.getA());
		b.run();
	}
	
	public void display2() {
    System.out.println("ABC");
    
  }
	
}
