public class App {
    public static void countdownn() {
        System.out.println("カウントダウンをします");
        for(int i = 5; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws Exception {
        countdownn();
    }
}
