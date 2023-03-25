package strategy;

public class Squirtle extends Pokemon {
    public Squirtle(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
        sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("꼬북 꼬북...");
    }
}
