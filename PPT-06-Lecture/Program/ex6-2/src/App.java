public class App {
    public static void methodA() {
        System.out.println("methodAが呼び出されました");
      }
    
      public static void main(String[] args) {
        methodA();
        methodB();
      }
    
      public static void methodB(){
        System.out.println("methodBが呼び出されました");
      }
}
