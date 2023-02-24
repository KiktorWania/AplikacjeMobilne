public abstract class Monster {
    protected float speed;
    protected float HP;
    protected float DMG;
    protected String name, sposobWalki;
    
    static int ID = 0;
    
    
    public abstract void info();
    
    public abstract void porownaj(Monster m);
    
    public abstract void attack(Monster m);
    
    
    public void init(float speed, float HP, float DMG, String name, String sposobWalki){
        this.speed = speed;
        this.HP = HP;
        this.DMG = DMG;
        this.name = name;
        this.sposobWalki = sposobWalki;
        ID++;
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
