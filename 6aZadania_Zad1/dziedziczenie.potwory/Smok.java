
package dziedziczenie.potwory;

public class Smok extends Monster{
    public Smok(float speed, float HP, float DMG){
        super(speed, HP, DMG);
        this.setSposobWalki("Zieje ogniem ");
        this.setName("Smok");
    }
}
