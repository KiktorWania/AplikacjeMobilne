package builder;

public class Main {
    public static void main(String args[]){
        Builder ksiazka1 = new Builder.ChildBuilder("Pan Tadeusz", "Adam Mickiewicz").liczbaStron(100).cena(20).obiekt();
        ksiazka1.show();
        
        Builder ksiazka2 = new Builder.ChildBuilder("Potop", "Henryk Sienkiewicz").obiekt();
        ksiazka2.show();
    }
}
