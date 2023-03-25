package strategy;

public class Charizard extends Pokemon {
    public Charizard(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
        sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("자몽 자몽!");
    }
}
