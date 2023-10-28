/**
While Loop for even numbers between 1 and 100 (inc)
*/
public class WhileEvenNumberInc{
  public static void main (String[]args){
    int i = 1;
    while (i <= 100){
        if (i % 2 == 0){
            System.out.print(i + " ");

	  }
	  i++;
    }
  }
}
