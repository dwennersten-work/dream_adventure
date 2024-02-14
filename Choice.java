import java.util.ArrayList;
import java.util.HashMap;

public class Choice {
    //every choice leads to new choices.  The String represents the choice the player can make. 
    HashMap<String, Choice> choices = new HashMap<String, Choice>(); 

    //speech is what the NPC will say at each choice the player makes.  
    String speech;

    public Choice(String speech){
        this.speech = speech;
    }

    public void printChoices(){
        for(String key: choices.keySet()){
            System.out.println();
        }
    }

    public Choice selectResponse(String selection){
        return null;
    }

    public void addChoice(Choice nextConversation){

    }

    public void speak(){
        System.out.println(speech);

    }

    public static void main(String[] args) {
        
    }
}
