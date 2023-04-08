package decorator;

public class ElectricDecorator implements PokemonDecorator {
    private Pokemon pokemon;

    public ElectricDecorator(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attack() {
        pokemon.attack();
        System.out.println(getName() + " 썬더볼트 공격 시전!");
    }

    @Override
    public int getLevel() {
        return pokemon.getLevel();
    }

    @Override
    public int getHP() {
        return pokemon.getHP();
    }

    @Override
    public String getName() {
        return pokemon.getName();
    }
}