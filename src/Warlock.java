public class Warlock extends Character{
    /**
     *   Warlock constructor inherits character class
     */
    Warlock(String name,int lvl,int hp,int mana){
        super(name,lvl,hp,mana);
    }
    /**
     *   Warlock's skill method class
     *   skill no. 1 casts damage and mana decreases upon cast
     */

    public void stiflingDagger(Character enemyCharacter, Character name){
        int damagePoints = 50;
        int manaDecrease = 35;
        System.out.println(super.characterName + " Casts Stifling Dagger (-35 Mana)" + enemyCharacter.characterName + " Damage done(-50 hp)");
        damageTarget(enemyCharacter,damagePoints,manaDecrease,name);
    }

    /**
     *  Warlock's skill no.2 : self-healing (Health Points Increases)
     */
    public void tangoHeal() {
        super.healthPoints += 50;
        System.out.println(super.characterName+" Health restored + 50hp");
    }

    /**
     * Warlock's skill no.3 with damage and mana reduction upon cast
     */

    public void phantomStrike(Character enemyCharacter,Character name){
        int damagePoints = 35;
        int manaDecrease = 15;
        System.out.println(super.characterName + " Casts Phantom Strike (-15 Mana) " + enemyCharacter.characterName + " Damage done(-35 hp)");
        damageTarget(enemyCharacter,damagePoints,manaDecrease,name);
    }
}
