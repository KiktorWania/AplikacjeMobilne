import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Potegi potegi = new Potegi(scanner.nextInt(), scanner.nextInt());
        System.out.println(potegi.getWynik());
    }
}