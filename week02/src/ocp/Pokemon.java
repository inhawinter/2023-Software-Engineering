package ocp;

public class Pokemon {
    private String name;
    private int level;
    private int hp;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        this.hp = 100;
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

    public void attack(String opponent){
        System.out.println(opponent + "를(을) 기본 공격합니다!");
    }
    public void evolve(){
        level++;
        hp = hp + 10;
        System.out.println(name + "이(가) " + level + "로 UP!");
    }
}
