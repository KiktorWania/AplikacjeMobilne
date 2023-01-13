package bank;

public class Rachunek {
    private Osoba osoba;
    public Metody metody;
    private float stanKonta;

    private int nr_konta;

    public Rachunek(Osoba osoba){
        this.osoba = osoba;
        
       metody = new Metody();
        stanKonta = 0;

        nr_konta = (int) Math.floor(Math.random() * (999999999 + 1));

        System.out.println("Utworzono rachunek " + osoba.getImie() + " " + osoba.getNazwisko() + " " + nr_konta);
    }

public class Metody{
    public Metody(){}
    
    public void wplac(float ile){
        stanKonta += ile;
        System.out.println("Wpłacono: " + ile);
    }
    public void wyplac(float ile){
        if(stanKonta >= ile){
            stanKonta -= ile;
            System.out.println("Wypłacono: " + ile);
        }else{
            System.out.println("Niewystarczająca ilość salda do przeprowadzenia tej operacji");
        }
    }
    
     public void przelej(Rachunek naRachunek, int ile){
        if(stanKonta >= ile){
            naRachunek.stanKonta += ile;
            stanKonta -= ile;
            System.out.println("Przelano: " + ile + " na konto "+ naRachunek.osoba.getImie() + " " + naRachunek.nr_konta);
        }else{
            System.out.println("Niewystarczająca ilość salda do przeprowadzenia tej operacji");
        }
    }
     
    public void info(){
        System.out.println("Saldo dla rachunku: " + osoba.getImie() + " " + osoba.getNazwisko() + " " + nr_konta + " wynosi: " + stanKonta);
    }
}

    // Gettery i Settery aka. akcesory


    public float getStanKonta() {
        return stanKonta;
    }

    public int getNr_konta() {
        return nr_konta;
    }

    public Osoba getOsoba() {
        return osoba;
    }
}
