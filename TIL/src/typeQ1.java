public class typeQ1 {

	public static void main(String[] args) {

		double[] scores = {80, 75, 55};
		int i = 0;
		double t = 0;
		while(i<scores.length) {
			t = t + scores[i];
			i++;
			if(i==scores.length) {
				System.out.println(t/scores.length);
			}
		}
	}
}
