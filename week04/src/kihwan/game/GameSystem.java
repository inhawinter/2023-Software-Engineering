package game;

import game.behavior.impl.JetPack;
import game.behavior.impl.NoFly;
import game.behavior.impl.Wings;
import game.pokemon.Pokemon;
import game.pokemon.impl.Charizard;
import game.pokemon.impl.Pikachu;
import game.pokemon.impl.Squirtle;
import game.weapon.impl.BubbleBeam;
import game.weapon.impl.Framethrower;
import game.weapon.impl.Thunderbolt;

public class GameSystem {
    public static void main(String[] args) {
        System.out.println("포켓몬스터 인하 게임을 시작합니다...");

        Pokemon pikachu = new Pikachu("피카츄", 1, 50, new Thunderbolt(), new NoFly());
        Pokemon charizard = new Charizard("리자몽", 1, 50, new Framethrower(), new Wings());
        Pokemon squirtle = new Squirtle("꼬부기", 1, 50, new BubbleBeam(), new JetPack());

        pikachu.sayHello();
        charizard.sayHello();
        squirtle.sayHello();

        pikachu.performAttack(charizard);
        charizard.performAttack(pikachu);
        squirtle.performAttack(charizard);


        pikachu.performFly();

        charizard.performAttack(squirtle);

        charizard.evolve();

        charizard.performFly();

        charizard.performAttack(charizard);

        squirtle.evolve();


        squirtle.performAttack(charizard);

        System.out.println("게임을 종료합니다!");
    }
}
