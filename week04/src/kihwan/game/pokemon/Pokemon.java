package game.pokemon;

import game.behavior.Fly;
import game.weapon.Weapon;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;

    protected Weapon weapon;

    protected Fly fly;

    public abstract void sayHello();

    public Pokemon(String name, int level, int hp, Weapon weapon, Fly fly) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.weapon = weapon;
        this.fly = fly;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = this.weapon;
    }

    public void performAttack(Pokemon pokemon) {
        if (weapon == null) {
            System.out.println("공격할 수 없습니다!");
            return;
        }
        weapon.attack(pokemon);
    }

    public void performFly() {
        fly.fly();
    }

    public void evolve() {
        System.out.println(name + "이(가) 진화했습니다!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
