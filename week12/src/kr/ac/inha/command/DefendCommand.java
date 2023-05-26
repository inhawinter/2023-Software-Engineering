package kr.ac.inha.command;

// 방어 커맨드 클래스
class DefendCommand implements Command {
    private Pokemon pokemon;

    public DefendCommand(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void execute() {
        pokemon.defend();
    }
}
