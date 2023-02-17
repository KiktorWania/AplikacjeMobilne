package dziedziczenie.potwory;

public class Zombie extends Monster{
    public Zombie(float speed, float HP, float DMG){
        super(speed, HP, DMG);
        this.setSposobWalki("Gryzie ");
        this.setName("Zombie");
    }
}
