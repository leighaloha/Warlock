public class Character {
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;


    /**
     * two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){
        System.out.println("null");
    }
    //Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    Character(String name, int lvl, int hp, int mana) {
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mana;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName() {
        System.out.println("Character Initialized : " + characterName);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter, int damagePoints, int manaDecrease, Character name) {
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);
        name.manaPoints = name.manaPoints - manaDecrease;

        /**
         * Prompt Character is defeated if HP falls below 0
         */
        // + Level Up Character
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
            name.level += 10;
            System.out.println(name.characterName + " Level up!!");

        }


    }

    /**
     * method  displaying current character details
     */

    public void displaydetails(){
        System.out.println("Wizard : " + characterName);
        System.out.println("Health Points : " + healthPoints);
        System.out.println("Mana Points : " + manaPoints);
        System.out.println("Level : " + level);
        System.out.print("\n");


    }

}
