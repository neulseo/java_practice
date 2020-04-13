package arrayLists;

import java.util.ArrayList;

public class arrayLists {

	public static void main(String[] args) {
		
		String[] fruits = new String[4];
		fruits[0] = "Mango";
		fruits[1] = "Peach";
		fruits[2] = "Watermelon";
		fruits[3] = "Papaya";
		System.out.println(fruits[3]);

		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Peach");
		fruitList.add("Watermelon");
		fruitList.add("Papaya");
		
		fruitList.remove("Mango");
		fruitList.contains("Watermelon");
		
		System.out.println(fruitList);
		System.out.println(fruitList.contains("Watermelon"));
	}

}
