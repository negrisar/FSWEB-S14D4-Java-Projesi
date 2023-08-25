package abstraction.main;
import abstraction.RPG.Monster;
import abstraction.RPG.Vampire;
import abstraction.RPG.Werewolf;

public class Main {

    public static void main(String[] args){
        Monster vampire = new Vampire("Dracula", 700, 35.5);
        System.out.println(vampire.attack());
        Monster werewolf = new Werewolf("Dogg", 600, 50 );
        System.out.println(werewolf.attack());
    }
}
