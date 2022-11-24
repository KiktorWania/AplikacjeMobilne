public class Rower {

    int speed, rozmiarKola;
    String name;

    public Rower(String name, int speed, int rozmiarKola){
        this.speed = speed;
        this.rozmiarKola = rozmiarKola;
        this.name = name;

        System.out.println(name + " predkosc: " + speed + " rozmiar kola: " + rozmiarKola);
    }

    void pedal(){
        speed++;
        System.out.println(name + " przyspieszyl, predkosc: " + speed);
    }
    void stop(){
        speed--;
        System.out.println(name + " zwolnil, predkosc: " + speed);
    }

}
