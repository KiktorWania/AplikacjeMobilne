public class Uczen extends Osoba{

    private String kierunek;
    
    public Uczen(String imie, String nazwisko, String kierunek) {
        init(imie, nazwisko);
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return "Uczen - Imie: " + getImie() + " Nazwisko: " + getNazwisko() + " Kierunek: " + kierunek;
    }

}
