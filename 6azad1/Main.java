public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Osoba[] osoby = new Osoba[100];
        
        osoby[0] = new Uczen("Mateusz", "Kuta", "Tp");
        osoby[1] = new Pracownik("Bodgan", "Szklankowski", "Programista", 20000);
        osoby[2] = new Uczen("Tomasz", "Matyja", "Tp");
        osoby[3] = new Pracownik("Andrzej", "Szklankowski", "Mechanik", 1000);
        
        for(Osoba o : osoby){
            if(o != null){
                System.out.println(o.toString());
            }
        }
        
        System.out.println("Tylko pracownicy: ");
        for(Osoba o : osoby){
            if(o != null){
                if(o instanceof Pracownik){
                    System.out.println(o.toString());
                }
            }
        }
        
        System.out.println("Tylko Uczniowie: ");
        for(Osoba o : osoby){
            if(o != null){
                if(o instanceof Uczen){
                    System.out.println(o.toString());
                }
            }
        }
        
        System.out.println(osoby[1].equals(osoby[3]));
        System.out.println(osoby[0].equals(osoby[2]));
        
        
        osoby[4] = (Osoba) osoby[0].clone();
        System.out.println(osoby[4].toString());
    }
    
}
