/**
Loop for odd numbers between 1 and 100 (inc)
*/
public class OddNumberInc{
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
		    if (i % 2 != 0) {
		        System.out.print(i + " ");
		    }
		}
	}
}
