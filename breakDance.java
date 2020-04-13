package breakDance;

public class breakDance {
// how to use break;
	public static void main(String[] args) {
		
		int i=0;
		while (i<5) {
			System.out.println("I love b o b a !");
			i++;
			
			if (i==1) {
				break;
			}
		}
		
		System.out.println("-------------------------------");
		
		int[] numbers = {10, 20, 30, 40, 50};
		for(int j=0; j<numbers.length;j++) {
			System.out.println(numbers[j]);
			if(numbers[j]==20) {
				break;
			}
			
		}

		System.out.println("-------------------------------");
		
		int t=2;
		
		switch(t) {
		case 0:
			System.out.println("Zero!");
			break;
		case 1:
			System.out.println("One!");
			break;
		default:
			System.out.println("Can't print out");
			break;
		}
		
	}

}
