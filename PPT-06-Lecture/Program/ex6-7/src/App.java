public class App {
  public static void methodA() {
    System.out.println("引数はありません");
  }

  public static void methodA(int i){
    System.out.println("int型の値" + i + "を受け取りました");
  }

  public static void methodA(double d) {
    System.out.println("double型の値" + d + "を受け取りました");
  }

  public static void methodA(String s) {
    System.out.println("文字列" + s + "を受け取りました");
  }
  public static void main(String[] args) throws Exception {
    methodA();
    methodA(1);
    methodA(0.1);
    methodA("Hello");
  }
}
