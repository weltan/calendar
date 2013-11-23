import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Calendar jan2013 = new Calendar(2013, 1);
    String[][] calendar = jan2013.dateLayout();
    for (int i = 0; i < 5; i++){
      System.out.println(Arrays.toString(calendar[i]));
    }
  }
}

