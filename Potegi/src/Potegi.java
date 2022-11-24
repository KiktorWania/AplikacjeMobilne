public class Potegi {
    int wynik;

    public Potegi(int podstawa, int potega){
        wynik = (int) Math.pow(podstawa, potega);
    }

    int getWynik(){
        return wynik;
    }
}
