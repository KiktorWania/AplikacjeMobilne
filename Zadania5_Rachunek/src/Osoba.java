public class Osoba {
    private String imie, nazwisko;

    public Osoba(){};

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Rachunek otworzRachunek(){
        return new Rachunek(this);
    }


    // Gettery i Settery aka. akcesory


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
