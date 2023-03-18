package ocp;

public class Pikachu extends Pokemon{
    public Pikachu(String name, int level, int hp) {
        super(name, level, hp);
        System.out.println("삐까삐까");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 100만볼트 공격을 합니다");
    }

    @Override
    public void evolve(){
        hp = hp + 30;
        level++;
        System.out.println(getName() + "이(가) 레벨 " + level + "으로 Up, 체력은 " + hp + "로 증가함");
    }
}
