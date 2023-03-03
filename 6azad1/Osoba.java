public abstract class Osoba implements Cloneable{
    private String imie, nazwisko;
    static private int ID = 0;
    
    public void init(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        ID++;
    }
    
    public boolean equals(Osoba os){
        int i = nazwisko.compareTo(os.nazwisko);
        if(i == 0){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        Osoba o = (Osoba) super.clone();
        return o;
    }
    
    @Override
    public abstract String toString();

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
