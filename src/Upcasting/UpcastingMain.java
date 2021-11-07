package Upcasting;

import java.util.ArrayList;
import java.util.List;

public class UpcastingMain {
	public static void main(String[] args) {
		List<Parent> list = new ArrayList<>();
		Child child1 = new Child(1, "Hieu", "2000", 100, 200);
		Child child2 = new Child(2, "Hieu2", "2000", 100, 200);
		list.add(child1);
		list.add(child2);
		for (Parent parent : list) {
			System.out.println(parent);
		}
		Parent child3 = new Child(3, "Hieu3", "2000", 100, 200);
//		Child child4 = new Parent
		System.out.println(child3);
	}
}
