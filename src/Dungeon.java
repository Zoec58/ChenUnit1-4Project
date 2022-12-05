public class Dungeon {
    //variables
    String name;
    String warriorClass;
    int atk;
    int def;
    int hp;

    public Dungeon(String name) {
        this.name = name;
        atk = 3;
        def = 0;
        hp = 10;
    }

    public void choosingClass(String chosenClass) {

    }

    public void greeting(){
        System.out.println("Welcome to [GENERIC MEDIEVAL GAME TITLE]!! This is a text-based game in which you will progress through a dungeon and fight monsters!!")
    }

}
