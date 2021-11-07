package OOP;

import java.util.ArrayList;

final class main {
	public static void main(String[] args) {
		parent parent = new parent();
		parent.setA(10);
		
		parent parent2 = parent;
		System.out.println(parent.getA()+ " "+parent2.getA());
		
		parent2 = null;
		try {
			System.out.println("parent1 :"+parent.getA());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("parent2 :"+parent2.getA());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}	
