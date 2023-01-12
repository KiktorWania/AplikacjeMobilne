public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Wiktor", "Kania");
        Osoba osoba2 = new Osoba("Andrzej", "Szklankowski");

        Rachunek rachunek1 = osoba1.otworzRachunek();
        Rachunek rachunek2 = osoba2.otworzRachunek();

        rachunek1.info();
        rachunek2.info();

        rachunek1.wplac(200);
        rachunek1.przelej(rachunek2, 100);
        rachunek2.wyplac(50);

        rachunek1.info();
        rachunek2.info();
    }
}