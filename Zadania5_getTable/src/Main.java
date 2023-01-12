import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj długość tablicy: ");
        Tablica tab = new Tablica();

        tab.set();
        tab.get();
        tab.print();
    }
}