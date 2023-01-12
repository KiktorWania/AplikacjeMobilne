public class Main {
    public static void main(String[] args) {
        Bottle a = new Bottle("a", 10, 5);
        Bottle b = new Bottle("b", 10, 10);

        b.przelej(a, 3);
    }
}