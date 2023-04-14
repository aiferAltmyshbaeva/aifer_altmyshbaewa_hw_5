package pl.aifer.game;

import pl.aifer.game.character.Boss;
import pl.aifer.game.character.Hero;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Boss boss = createBoss();
        printInfo(boss);

        Hero[] army = createArmyOfHeroes(3);
        printInfo(army);
    }

    private static Boss createBoss() {
        Boss boss = new Boss();
        boss.setHealth(RANDOM.nextInt(100));
        boss.setDamage(RANDOM.nextInt(100));
        boss.setDefense("Magic");
        return boss;
    }

    private static Hero[] createArmyOfHeroes(int count) {
        Hero[] heroes = new Hero[count];
        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = createHero();
        }
        return heroes;
    }

    private static Hero createHero() {
        return RANDOM.nextBoolean() ? createSimpleHero() : createSuperhero();
    }

    private static Hero createSuperhero() {
        return new Hero(RANDOM.nextInt(100), RANDOM.nextInt(100), "Magic");
    }

    private static Hero createSimpleHero() {
        return new Hero(RANDOM.nextInt(100), RANDOM.nextInt(100));
    }

    private static void printInfo(Boss boss) {
        System.out.println("boss = " + boss);
    }

    private static void printInfo(Hero[] heroes) {
        for (Hero hero : heroes) {
            System.out.println("hero = " + hero);
        }
    }
}