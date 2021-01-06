package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
    int health;
    double physDef;
    double magicDef;
    int physAtt;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attScore = physAtt * (1 - hero.physDef);
        if (hero.health - attScore < 0) {
            hero.health = hero.MIN_HEALTH;
        } else {
            hero.health -= attScore;
        }

    }
}
