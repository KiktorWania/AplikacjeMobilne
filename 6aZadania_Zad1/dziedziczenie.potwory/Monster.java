package dziedziczenie.potwory;

public class Monster {
    private float speed;
    private float HP;
    private float DMG;
    private String name, sposobWalki;
    
    public Monster(float speed, float HP, float DMG){
        this.speed = speed;
        this.HP = HP;
        this.DMG = DMG;
    }
    
    public void info(){
        System.out.println("Name " + name);
        System.out.println("HP: " + HP);
        System.out.println("DMG: " + DMG);
        System.out.println("Speed: " + speed + "\n");
    }
    
    public void porownaj(Monster m){
        System.out.println("Porownanie: " + name + " i " + m.name);
        System.out.println("HP " + name + ": " + HP + " - HP " + m.name + ": " + m.HP);
        System.out.println("DMG " + name + ": " + DMG + " - DMG " + m.name + ": " + m.DMG);
        System.out.println("Speed " + name + ": " + speed + " - Speed " + m.name + ": " + m.speed);
        System.out.println("Sposob walki " + name + ": " + sposobWalki + " - Sposob walki " + m.name + ": " + m.sposobWalki + "\n");
    }
    
    public void attack(Monster m){
        System.out.println(getName() + " " + sposobWalki + "i zadaje "+ this.getDMG() + " obrazen " + m.name + "\n");
        m.HP -= DMG;
    }
    
    //akcesory

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getHP() {
        return HP;
    }

    public void setHP(float HP) {
        this.HP = HP;
    }

    public float getDMG() {
        return DMG;
    }

    public void setDMG(float DMG) {
        this.DMG = DMG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSposobWalki() {
        return sposobWalki;
    }

    public void setSposobWalki(String sposobWalki) {
        this.sposobWalki = sposobWalki;
    }
    
}
