/**
 * Created with IntelliJ IDEA.
 * User: uKen
 * Date: 11/23/13
 * Time: 3:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calendar {
  private int year;
  private int month;

  Calendar(int year, int month) {
    this.year = year;
    this.month = month;
  }

  private int getFirstDayOfMonth(){
    return 2;
  }

  private int getDaysInMonth(){
    return 31;
  }

  public String[][] dateLayout() {
    int firstday = this.getFirstDayOfMonth();
    int days = this.getDaysInMonth();
    int[] iMonth = new int[35];
    String[][] sMonth = new String[5][7];

    for(int i = 0; i < days; i++){
      iMonth[i+firstday] = i+1;
    }

    int k = 0;
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 7; j++) {
        sMonth[i][j] = Integer.toString(iMonth[k++]);
      }
    }

    return sMonth;
  }
}
