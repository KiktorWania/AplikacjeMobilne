public class Bottle {
    private int pojemnosc, poziom;
    private String nazwa;

    public Bottle(String nazwa, int pojemnosc, int poziom){
        this.nazwa = nazwa;
        this.pojemnosc = pojemnosc;
        this.poziom = poziom;

        if(poziom > pojemnosc){
            this.poziom = pojemnosc;
        }

        info();
    }
    public Bottle(){
        nazwa = "Butelka";
        pojemnosc = 0;
        poziom = 0;
    }

    public void wlej(int ile){
        if(poziom + ile > pojemnosc){
            System.out.println("Za mała pojemność butelki " + nazwa + ", nie przeleje");
            System.out.println("Moge przelać tylko: " + (pojemnosc - poziom) + "L");
        }else{
            poziom += ile;
            System.out.println("Wlales do butelki " + nazwa + " " + ile + " L");
            System.out.println("Obecnie w butelce " + nazwa + " jest " + poziom);
        }
    }
    public void wylej(int ile){
        if(poziom - ile < 0){
            System.out.println("Za mały poziom butelki "+ nazwa +", nie wyleje");
            System.out.println("Moge wylac tylko: " + poziom + "L");
        }else{
            poziom += ile;
            System.out.println("Wylales z butelki " + nazwa + " " + ile + " L");
            System.out.println("Obecnie w butelce " + nazwa + " jest " + poziom);
        }
    }
    public void przelej(Bottle bottle, int ile){
        if(poziom < ile){
            System.out.println("Chcesz za dużo przelac, w butelce " + nazwa + " jest tylko " + poziom + "L");
        }else if(bottle.pojemnosc - bottle.poziom < ile){
            System.out.println("W butelce " + bottle.nazwa + " jest za mało miejsca, możesz przelac max. " + bottle.poziom + "L");
        }else{
            poziom -= ile;
            bottle.poziom += ile;
            System.out.println("Przelano " + ile + "L z butelki " + nazwa + " do butelki " + bottle.nazwa);
            System.out.println("W " + nazwa + " zostalo: " + poziom);
            System.out.println("W " + bottle.nazwa + " zostalo: " + bottle.poziom);
        }
    }

    public void info(){
        System.out.println("Butelka " + nazwa + ": pojemnosc: " + pojemnosc + " poziom: " + poziom + " l");
    }

    //Gettery i Settery

    public int getPojemnosc() {
        return pojemnosc;
    }

    public int getPoziom() {
        return poziom;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public void setPoziom(int poziom) {
        this.poziom = poziom;
    }
}
