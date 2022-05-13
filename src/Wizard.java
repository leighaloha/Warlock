public class Wizard extends Character{
    /**
     *   Wizard constructor inherits character class
     */

    Wizard(String name, int lvl, int hp, int mana){
        super(name,lvl,hp,mana);
    }

    /**
     *  Wizard's Skills method class
     *     //Wizard skill no.1 with damage and mana reduction upon cast
     */
    public void fireStorm(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        int manaDecrease = 30;
        damageTarget(enemyCharacter,damagePoints,manaDecrease,name);
    }

    /**
     * Wizard's 2nd skill: self-healing (Health Points Increases)
     */

    public void healfountain(){
        super.healthPoints += 60;
        System.out.println(super.characterName + " Health restored + 60 hp");
    }
    /**
     * Wizard's skill no.3 with damage and mana reduction upon cast
     */

    public void rupture (Character enemyCharacter, Character name){
        int damagePoints = 60;
        int manaDecrease = 50;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Rupture (Damage - 60)");
        damageTarget(enemyCharacter,damagePoints,manaDecrease,name);
    }
}