import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class typeQ9 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,1,2,2,3,3,3,4,4,5));
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("");
		
		int i = 1;
		System.out.println(i-0);
		while (i<numbers.size()) {
			numbers.sort(Comparator.naturalOrder());
			int a = numbers.get(i-1);
			int b = numbers.get(i);
			if(b!=a && i<=numbers.size()) {
				System.out.println(b);		
			} 
			i++;
		}
	}

}
