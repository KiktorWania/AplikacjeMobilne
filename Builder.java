package builder;

public class Builder {
    private final String tytul, autor;
    private final int liczbaStron;
    private int cena;
    
    public Builder(ChildBuilder ob){
        tytul = ob.tytul;
        autor = ob.autor;
        liczbaStron = ob.liczbaStron;
        cena = ob.cena;
    }
    
    public void show(){
        System.out.println("tytul: " + tytul + "\t Autor: " + autor + "\t liczba stron: " + liczbaStron + "\n cena:" + cena);
    }
    
    public static class ChildBuilder{
        String tytul;
        String autor;
        int liczbaStron;
        int cena;

        public ChildBuilder(String tytul, String autor){
            this.tytul = tytul;
            this.autor = autor;
        }

        public ChildBuilder liczbaStron(int liczbaStron){
            this.liczbaStron = liczbaStron;
            return this;
        }

        public ChildBuilder cena(int cena){
            this.cena = cena;
            return this;
        }

        public Builder obiekt(){
            return new Builder(this);
        }
    }
}



