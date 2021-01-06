package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
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


}
