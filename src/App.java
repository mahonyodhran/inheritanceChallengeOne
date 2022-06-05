public class App {
    public static void main(String[] args) throws Exception {
        Ferrari f50 = new Ferrari(36);
        f50.steer(45);
        f50.accelerate(30);
        f50.accelerate(20);
        f50.accelerate(-42);
    }
}
