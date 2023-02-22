package textadventureitems;

public class Enemy {
    private int health;
    private int attack;
    public Enemy(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
}



