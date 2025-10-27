public class App {
  public static double getAreaOfCircle(double radius) {
    return radius * radius * 3.14;
  }
  
  public static void main(String[] args) throws Exception {
    double circleArea = getAreaOfCircle(2.5);
    System.out.println("半径2.5の円の面積は" + circleArea);
  }
}
