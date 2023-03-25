package strategy;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    protected Weapon weapon;
    protected Fly fly;

    public Pokemon() {
    }

    public Pokemon(String name, int level, int hp, Weapon weapon, Fly fly) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.weapon = weapon;
        this.fly = fly; // Fly 추가
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void performAttack(Pokemon pokemon) {
        weapon.attack(pokemon);
    }

    public void performFly() {
        fly.fly();
    }

    public abstract void sayHello();

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
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
