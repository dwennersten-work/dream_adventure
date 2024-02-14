import java.util.ArrayList;

public class NPC {
    private int health;
    private String description, name;
    private ArrayList<Item> items;
    
    public NPC(int health, String description, String name){
        this.health = health;
        this.description = description;
        this.name = name;
    }

    public void speak(){
    }

}
