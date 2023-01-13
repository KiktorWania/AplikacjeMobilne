package bank;

public class Main {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Wiktor", "Kania");
        Osoba o2 = new Osoba("Andrzej", "Szklankowski");
        
        Rachunek r1 = o1.otworzRachunek();
        
       r1.metody.wplac(200);
       r1.metody.wyplac(100);
       
       Rachunek r2 = o2.otworzRachunek();
       
       r1.metody.przelej(r2, 50);
       
       r1.metody.info();
       r2.metody.info();
        
    }
    
}
