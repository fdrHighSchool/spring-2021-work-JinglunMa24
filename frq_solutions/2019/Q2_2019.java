import java.util.*;

public class StepTracker {
  private ArrayList<Integer> dailySteps;
  private int activeDay = 0;

  public StepTracker(int s) {
    this.dailySteps = new ArrayList<Integer> ();
    this.activeDay  = s;
  } //end StepTracker()

  public int activeDays() {
    int total = 0;
    for (int s : dailySteps) {
      total += s;
    } //end for each loop
    return total / this.activeDay;
  } //end activeDay()

  public void addDailySteps(int s) {
    this.dailySteps.add(s);
  } //end addDailySteps()

  public double averageSteps() {
    double result = 0.0;
    for (int step : dailySteps) {
      result += step;
    } //end for each loop
    return result / this.dailySteps.size();
  } //end averageSteps

} //end class
