package model.classes;

public class Spell {
    private int id;
    private double scalling;
    private int spellpower;
    private double damage;
    private int cooldown;
    private int casttime;


    public Spell(int id, int scalling, int casttime, int cooldown){
        this.id=id;
        this.scalling=scalling;
        this.casttime = casttime;
        this.cooldown = cooldown;
    }

    public void setSpellpower(int spellpower){
        this.spellpower=spellpower;
    }

    public void computeDamage(){
        this.damage = spellpower * scalling;
    }
}
