public class App {
    public static void countdown(int start) {
        System.out.println("メソッドが受け取った値:" + start);
        System.out.println("カウントダウンをします");
        for(int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws Exception {
        countdown(10);
    }
}
