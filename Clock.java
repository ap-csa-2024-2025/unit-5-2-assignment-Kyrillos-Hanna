public class Clock
{
  public static void main(String[] args)
  {
    int time1 = 23;
    int time2 = 10;
    int time3 = 0;
    int time4 = 13;
    int time5 = 12;
    int time6 = 18;

    timeOfDay(time1);
    timeOfDay(time2);
    timeOfDay(time3);
    timeOfDay(time4);
    timeOfDay(time5);
    timeOfDay(time6);
  }

  private static void timeOfDay(int hour) {
    if (hour <= 24 && hour>= 0) {
      if (hour == 0) {
        System.out.println("midnight");
      } else if (hour == 12) {
        System.out.println("noon");
      } else if (hour == 18) {
        System.out.println("dusk");
      } else if (hour > 0 && hour < 12) {
        System.out.println("morning");
      } else if (hour > 12 && hour < 18) {
        System.out.println("afternoon");
      } else if (hour > 18 && hour < 24) {
        System.out.println("evening");
      }
    }
  }

}
