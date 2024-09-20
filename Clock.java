public class Clock
{
  public static void main(String[] args)
  {
    int clone1 = 23;
    int clone2 = 10;
    int clone3 = 0;

    timeOfDay(clone1);
    timeOfDay(clone2);
    timeOfDay(clone3);
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
        System.out.println("eveningt");
      }
    }
  }

}
