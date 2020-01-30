package max;

import java.util.ArrayList;

public class MyList {
	 ArrayList<String> myList = new ArrayList<>();

		public void add(String value) {
			myList.add(value);
		}

		public void remove(int index) {
			if (myList.size() > index)
				myList.remove(index);
		}
		
		public void print(){
			System.out.println(myList);
		}
			

}
