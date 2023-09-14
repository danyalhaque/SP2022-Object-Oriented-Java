package assignment;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> list = new ArrayList<>();
	


	public RemoveDuplicates(ArrayList<Integer> list2) {
		// TODO Auto-generated constructor stub
		this.list =list2;
		removeDuplicate();
	}


	public void removeDuplicate() {

		for (int i = 0; i < this.list.size(); i++) {
			for (int q = 1; q < this.list.size(); q++) {
				if (i != q) {
					if (this.list.get(i) == this.list.get(q)) {
					this.list.remove(q);
				}
			}
		}
		}
		System.out.println("The distinct integers are " + this.list);

	}
}
