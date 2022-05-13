public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");

        //Wizard and Warlock object class inheriting Character Class
        Wizard Character1 = new Wizard("Player1", 1, 100, 200);
        Warlock Character2 = new Warlock("Player2",1,100,200);

        //character actions sequence
        //1 skill required per round
        System.out.print("\n");
        //Displaying Character name and details
        Character1.displayName();
        Character1.displaydetails();
        Character2.displayName();
        Character2.displaydetails();

        //first round match
        System.out.println("\n-------------------");
        System.out.println("Let The Game Begin!\n");
        System.out.println("Round 1\n");
        //skill casts
        Character1.fireStorm(Character2,Character1);
        Character2.stiflingDagger(Character1,Character2);
        //displaying current character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //second round match
        System.out.println("Round 2\n");
        //skill casts
        Character2.phantomStrike(Character1,Character2);
        Character1.rupture (Character2,Character1);
        //displaying current character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //Third round match
        System.out.println("Round 3\n");
        //skill casts
        Character1.healfountain();
        Character2.stiflingDagger(Character1,Character2);
        //displaying current character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //Fourth round match
        System.out.println("Round 4\n");
        //skill casts
        Character2.phantomStrike(Character1,Character2);
        Character1.fireStorm(Character2,Character1);
        //displaying current character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();


    }
}