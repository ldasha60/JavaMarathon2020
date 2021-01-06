package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    private int magicAtt = 15;
    private final int MAX_HEALTH = 100;
    private final int HEAL_YOU = 50;
    private final int HEAL_TEAM = 30;

    public Shaman(){
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEAL_YOU > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_YOU;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAM > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAM;
        }

    }

    @Override
    public void magicalAttack(Hero hero) {
        double magAttScore = magicAtt * (1 - magicDef);
        if (hero.health - magAttScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= magAttScore;
        }

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
