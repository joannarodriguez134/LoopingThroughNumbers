/**
Loop for odd numbers between 1 and 100 (decreasing)
*/
public class OddNumberDec{
	public static void main(String[] args) {
		for (int i = 100; i >= 1; i--) {
		    if (i % 2 != 0) {
		        System.out.print(i + " ");
		    }
		}
	}
}
