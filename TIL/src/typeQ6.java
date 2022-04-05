import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class typeQ6 {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
		System.out.println(myList);
		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);		
		
		ArrayList<String> yourList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
		System.out.println(yourList);
		String result = String.join(" ", yourList);
		System.out.println(result);
		
	}

}
