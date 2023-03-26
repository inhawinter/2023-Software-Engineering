package game.pokemon.impl;

import game.behavior.Fly;
import game.pokemon.Pokemon;
import game.weapon.Weapon;

public class Charizard extends Pokemon {
    public Charizard(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
    }

    @Override
    public void sayHello() {
        System.out.println("자몽 자몽!");
    }
}
