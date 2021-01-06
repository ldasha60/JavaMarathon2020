package day11.task2;

public class Paladin extends Hero implements Healer {
    private final int MAX_HEALTH = 100;
    private final int HEAL_YOU = 25;
    private final int HEAL_TEAM = 10;

    public Paladin() {
        physDef = 0.5;
        physAtt = 15;
        magicDef = 0.2;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
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
}
