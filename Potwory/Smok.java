public class Smok extends Monster{
    public Smok(float speed, float HP, float DMG){
        init(speed,HP,DMG,"Smok", "Zieje ogniem");
    }

    @Override
    public void info() {
        System.out.println("Name " + name);
        System.out.println("HP: " + HP);
        System.out.println("DMG: " + DMG);
        System.out.println("Speed: " + speed + "\n");
    }

    @Override
    public void porownaj(Monster m) {
        System.out.println("Porownanie: " + name + " i " + m.name);
        System.out.println("HP " + name + ": " + HP + " - HP " + m.name + ": " + m.HP);
        System.out.println("DMG " + name + ": " + DMG + " - DMG " + m.name + ": " + m.DMG);
        System.out.println("Speed " + name + ": " + speed + " - Speed " + m.name + ": " + m.speed);
        System.out.println("Sposob walki " + name + ": " + sposobWalki + " - Sposob walki " + m.name + ": " + m.sposobWalki + "\n");
    }

    @Override
    public void attack(Monster m) {
        System.out.println(getName() + " " + sposobWalki + "i zadaje "+ this.getDMG() + " obrazen " + m.name + "\n");
        m.HP -= DMG;
    }
    
}
