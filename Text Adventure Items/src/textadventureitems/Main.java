package textadventureitems;

public class Main {
    public static void main(String[] args) {
        goldBar goldBar = new goldBar(500);
        Weapon magicSword = new magicSword(50, 100);
        Weapon softPillow = new softPillow(10, 20);
        Weapon bigMace = new bigMace(75, 150);
        Weapon Arrow = new Arrow( 25, 75);
        Enemy greenOgre = new Ogre(50, 5);
        Enemy redOgre = new Ogre(75, 10);
        Enemy slowZombie = new Zombie(20, 1);
        Enemy fastZombie = new Zombie(40, 3);
        Enemy spotDog = new Dog(30, 2);
        Enemy GiantSpider = new GiantSpider(50, 3);
        Enemy Goblin = new Goblin(25, 3);

        // code to use the objects in a text adventure game goes here
    }
}
