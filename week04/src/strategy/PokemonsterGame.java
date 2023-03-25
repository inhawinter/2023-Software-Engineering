package strategy;

public class PokemonsterGame {
    public static void main(String[] args) {
        System.out.println("포켓몬스터 인하 게임을 시작합니다...");

        Weapon thunderbolt = new Thunderbolt();
        Weapon flamethrower = new Flamethrower();
        Weapon bubbleBeam = new BubbleBeam();

        Fly jetPack = new JetPack();
        Fly wings = new Wings();
        Fly noFly = new NoFly();

        Pokemon pikachu = new Pikachu("피카츄", 4, 20, thunderbolt, jetPack);
        Pokemon charizard = new Charizard("리자몽", 10, 50, flamethrower, wings);
        Pokemon squirtle = new Squirtle("꼬부기", 5, 25, bubbleBeam, noFly);

        pikachu.performAttack(charizard);
        charizard.performAttack(pikachu);

        squirtle.performAttack(charizard);
        squirtle.performFly();;
        charizard.performAttack(squirtle);

        charizard.evolve();
        charizard.performFly();
        charizard.performAttack(pikachu);

        squirtle.evolve();
        squirtle.performAttack(charizard);

        System.out.println("게임을 종료합니다!");
    }
}
