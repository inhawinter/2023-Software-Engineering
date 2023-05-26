package kr.ac.inha.command;

// 공격 커맨드 클래스
class AttackCommand implements Command {
    private Pokemon pokemon;

    public AttackCommand(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void execute() {
        pokemon.attack();
    }
}