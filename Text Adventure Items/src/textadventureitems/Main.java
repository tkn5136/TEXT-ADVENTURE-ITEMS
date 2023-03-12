package textadventureitems;
import java.util.ArrayList;
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
        Enemy Goblin = new Goblin(25, 3, 10);
        Action flee = new Flee();
        Action viewInventory = new ViewInventory();
        Action moveEast = new MoveEast();
        Action moveNorth = new MoveNorth();
        Action moveSouth = new MoveSouth();
        Action moveWest = new MoveWest();
        Action jump = new Jump();
        World world = new World();
        MapTile leaveCaveRoom = new MapTile(0, 0);
        MapTile cyclopsRoom = new MapTile(0, 1);
        MapTile emptyCavePath1 = new MapTile(0, 2);
        MapTile emptyCavePath2 = new MapTile(1, 2);
        MapTile treasureRoom1 = new MapTile(2, 2);
        MapTile ogreRoom = new MapTile(0, 3);
        MapTile treasureRoom2 = new MapTile(1, 3);
        MapTile startingRoom = new MapTile(2, 3);
        MapTile treasureRoom3 = new MapTile(3, 3);
        MapTile findDaggerRoom = new MapTile(4, 3);

        // code to use the objects in a text adventure game goes here
    }
}
