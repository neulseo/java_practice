
public class booleanPractice {

	public static void main(String[] args) {
		
		boolean missedDoor = false;
		boolean passedDoor = true;
		boolean passedAllDoors = true;
		int doorCount=0;
		
		if(missedDoor) {
			System.out.println("We passed the first door!");
			doorCount = doorCount+1;
		}
		if(passedDoor) {
			System.out.println("We passed the second door!");
			doorCount = doorCount+1;
		}
		if(passedDoor) {
			System.out.println("We passed the third door!");
			doorCount = doorCount+1;
		}
		if(doorCount ==3) {
			passedAllDoors = true;
		}
		if(doorCount !=3) {
			System.out.println("Try again.");
		}
		if(passedAllDoors) {
			System.out.println("Congratulations! You won the program.");
		}
		
	}

}
