public class Pracownik extends Osoba{
    
    private String stanowisko;
    private float wynagrodzenie;
    
    public Pracownik(String imie, String nazwisko, String stanowisko, float wynagrodzenie) {
        init(imie, nazwisko);
        
        this.stanowisko = stanowisko;
        this.wynagrodzenie = wynagrodzenie;
    }
    
    @Override
    public String toString() {
        return "Pracownik - Imie: " + getImie() + " Nazwisko: " + getNazwisko() + " Stanowisko: " + stanowisko + " Wynagrodzenie: " + wynagrodzenie;
    }

}
